package com.filimo.domain.usecase

import com.filimo.domain.dataModel.SearchMovieListResultModel
import com.filimo.domain.repository.SearchMovieRepository
import javax.inject.Inject

class GetMovieSearchResultUseCase @Inject constructor(val repository: SearchMovieRepository)
    : BaseUseCase<String, SearchMovieListResultModel>() {

    override suspend fun onExecute(param: String?): SearchMovieListResultModel? {
      return param?.let { repository.getMovieSearchResult(it) }
    }
}