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
    val searchMovieResultLiveData = MutableLiveData<ArrayList<SearchMovie>>()


    fun callGetSearchMovieResultRequest(textChanged: String?) {

        launchCoroutine {
            try {
                searchMovieResultFlow = flowOf(getSearchMovieSearchResultUseCase.onExecute(textChanged)) as Flow<SearchMovieListResult>
                searchMovieResultFlow.catch { exception -> showMessageError.value = exception.message }
                searchMovieResultFlow.collect {
                    searchMovieResultLiveData.postValue(it.data)
                }
            } catch (e: java.lang.IllegalStateException) {
                println("${e.message}")
            } catch (e: IOException) {
                println("${e.message}")
            } catch (e: Exception) {
                println(" ${e.message}")
            }
        }
    }

}

