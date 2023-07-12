package com.filimo.searchmovie.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() {

    fun launchCoroutine(
        executorDispatcher: CoroutineDispatcher = Dispatchers.Default,
        action: suspend () -> Unit
    ) {

        var context = executorDispatcher
        viewModelScope.launch(context) { action() }
    }
}
