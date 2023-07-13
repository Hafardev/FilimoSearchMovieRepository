package com.filimo.domain.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

abstract class BaseUseCase<P,Flow>  {

    var executorDispatcher = Dispatchers.Default

    abstract suspend fun onExecute(param :P ?) :Flow ?

   open suspend fun executeHandler (param: P ? ) : Flow ?{
        return withContext(executorDispatcher){
            onExecute(param)
        }
    }

}