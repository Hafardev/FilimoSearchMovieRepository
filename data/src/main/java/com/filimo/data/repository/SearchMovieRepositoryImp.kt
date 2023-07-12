package com.filimo.data.repository

import com.filimo.data.api.SearchMovieApi
import com.filimo.data.dataModel.SearchMovieListResult
import com.filimo.domain.repository.SearchMovieRepository
import javax.inject.Inject

class SearchMovieRepositoryImp @Inject constructor(val api : SearchMovieApi) :
    SearchMovieRepository {

    override suspend fun getMovieSearchResult(param: String): SearchMovieListResult {
        return api.getMovieSearchResult(param)
    }
}
