package com.filimo.searchmovie.di

import com.filimo.data.api.SearchMovieApi
import com.filimo.data.network.RetrofitHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import okhttp3.Interceptor
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
class ApiServiceModule {

    @Provides
    fun provideRetrofit(interceptorsMap: Map<Int, @JvmSuppressWildcards Interceptor>): Retrofit {

        val headerMapParams: MutableMap<String, String> = mutableMapOf()
        headerMapParams.put("Content-Type", "application/json")

        return RetrofitHelper.createRetrofit(
            baseUrl = "https://www.filimo.com",
            interceptorMap = interceptorsMap,
            headerMap = headerMapParams
        )
    }


    @Provides
    fun provideSearchMovieService(retrofit: Retrofit): SearchMovieApi =
        retrofit.create(SearchMovieApi::class.java)

}