package com.filimo.searchmovie.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.filimo.data.dataModel.SearchMovie
import com.filimo.data.dataModel.SearchMovieListResult
import com.filimo.domain.usecase.GetMovieSearchResultUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class SearchMovieViewModel @Inject constructor(
    val getSearchMovieSearchResultUseCase: GetMovieSearchResultUseCase,
) : BaseViewModel() {

    lateinit var searchMovieResultFlow: Flow<SearchMovieListResult>
    var messageError = MutableLiveData<String>()
    var searchResultMessage = MutableLiveData<String>("جستجوی شما یافت نگردید")
    val searchMovieResultLiveData = MutableLiveData<ArrayList<SearchMovie>>()


    fun callGetSearchMovieResultRequest(textChanged: String?) {
        val executorDispatcher: CoroutineDispatcher = Dispatchers.IO
        val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
            messageError.value = exception.message
        }

        var context = defaultExceptionHandler + executorDispatcher
        viewModelScope.launch(context) {
            try {
                searchMovieResultFlow = flowOf( getSearchMovieSearchResultUseCase.onExecute(textChanged)) as Flow<SearchMovieListResult>
                searchMovieResultFlow.catch { exception -> messageError.value = exception.message }
                searchMovieResultFlow.collect {
                    println("vm")
                    searchMovieResultLiveData.postValue(it.data)
                }
            } catch (e: java.lang.IllegalStateException) {
                println("IllegalStateException ${e.message}")
            } catch (e: IOException) {
                println("IOException${e.message}")
            } catch (e: Exception) {
                println("Exception ${e.message}")
            }
        }
    }

}

