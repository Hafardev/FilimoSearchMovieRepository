package com.filimo.searchmovie.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.filimo.data.dataModel.SearchMovieListResult
import com.filimo.domain.usecase.GetMovieSearchResultUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class SearchMovieViewModel@Inject constructor(
    val getSearchMovieSearchResultUseCase: GetMovieSearchResultUseCase,
    ) : BaseViewModel() {

        var messageError = MutableLiveData<String>()
        lateinit var searchMovieResultFlow: Flow<SearchMovieListResult>


        fun callGetSearchMovieResultRequest(){
            try {
                launchCoroutine {
                    val items = getSearchMovieSearchResultUseCase.onExecute("break")
                    searchMovieResultFlow = flowOf(items) as Flow<SearchMovieListResult>
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

