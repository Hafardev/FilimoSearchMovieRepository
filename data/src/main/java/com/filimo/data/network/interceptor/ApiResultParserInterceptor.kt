package com.filimo.data.network.interceptor

import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Response
import okhttp3.ResponseBody
import okhttp3.ResponseBody.Companion.toResponseBody
import java.lang.invoke.MethodHandles


class ApiResultParserInterceptor : Interceptor {
    private val jsonConverter = Gson()

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)
        val resBody = response.body
        if (response.isSuccessful) {
            try {
                return resBody?.let {
                    val newBody = extractDataFromResponse(it.string(), response)
                    response.newBuilder().body(newBody).build()
                } ?: response
            }catch (e: Exception){
                println("resultBody1 ${e.message}")
            }
        }else {
            try {

            }catch (e: Exception){
                println("resultBody ${e.message}")
            }
        }
        return response
    }


    private fun extractDataFromResponse(body: String, response: Response): ResponseBody {
       // val res = body.replaceFirst("{", "")
        //var index = res.lastIndexOf("}")
        val responseBody = StringBuilder(body).toString()
            .toResponseBody((response.header("Content-Type") ?: "application/json").toMediaType())
        return responseBody
    }
}