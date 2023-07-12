package com.filimo.searchmovie.di

import com.example.demotask.di.annotation.Order
import com.filimo.data.api.SearchMovieApi
import com.filimo.data.network.RetrofitHelper
import com.filimo.data.network.interceptor.ApiResultParserInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.multibindings.IntoMap
import okhttp3.Interceptor
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
class ApiServiceModule {

    @IntoMap
    @Order(100)
    @Provides
    fun provideResponseParseInterceptor(): Interceptor = ApiResultParserInterceptor()


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