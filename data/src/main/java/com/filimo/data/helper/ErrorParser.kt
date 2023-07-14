package com.filimo.data.helper

import com.google.gson.Gson
import retrofit2.HttpException
import java.io.EOFException
import java.io.IOException
import java.io.InterruptedIOException
import java.net.ProtocolException
import java.net.SocketException
import java.net.UnknownHostException
import javax.net.ssl.SSLException
import java.net.ConnectException

object ErrorParser {
    fun parse(throwable: Throwable): String {
        if (throwable is ConnectException || throwable.cause is ConnectException ||
            throwable is ProtocolException
        ) return ("ارتباط با سرور برقرار نشد!")
        if (throwable is SocketException ||
            throwable is InterruptedIOException ||
            throwable is UnknownHostException ||
            throwable is EOFException ||
            throwable is SSLException
        ) return ("ارتباط با سرور برقرار نشد،لطفا اتصال اینترنت خود را بررسی نمایید!")

        if (throwable is IOException) return ("ارتباط با سرور برقرار نشد! مجددا تلاش نمایید.")

        if (throwable is HttpException) {
        return  ( "بروز خطا در دریافت اطلاعات")
        }
        return ("بروز خطا در اتصال")
    }

}