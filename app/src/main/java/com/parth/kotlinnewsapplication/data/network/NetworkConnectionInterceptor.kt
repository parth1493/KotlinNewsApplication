package com.parth.kotlinnewsapplication.data.network

import android.content.Context
import com.parth.kotlinnewsapplication.utils.NoInternetException
import com.parth.kotlinnewsapplication.utils.isInternetAvailable
import okhttp3.Interceptor
import okhttp3.Response


class NetworkConnectionInterceptor(
    private val context: Context
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable(context))
            throw NoInternetException("Make sure you have an active data connection")
        return chain.proceed(chain.request())
    }



}