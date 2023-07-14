package com.filimo.searchmovie.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.filimo.data.helper.ErrorParser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.EmptyCoroutineContext

@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() {

    var showMessageError = MutableLiveData<String>()
    fun launchCoroutine(
        executorDispatcher: CoroutineDispatcher = Dispatchers.IO,
        useDefaultExceptionHandling: Boolean = true,
        action: suspend () -> Unit
    ) {
        val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
            val errorMessage = ErrorParser.parse(exception)
            showMessageError.value = errorMessage
        }
        var context = if (useDefaultExceptionHandling) defaultExceptionHandler else EmptyCoroutineContext
        context += executorDispatcher
        viewModelScope.launch(context) { action() }
    }
}
