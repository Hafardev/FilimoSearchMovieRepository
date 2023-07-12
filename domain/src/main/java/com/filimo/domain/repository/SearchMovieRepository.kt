package com.filimo.domain.repository

import com.filimo.domain.dataModel.SearchMovieListResultModel

interface SearchMovieRepository {
    suspend fun getMovieSearchResult(param: String): SearchMovieListResultModel

}