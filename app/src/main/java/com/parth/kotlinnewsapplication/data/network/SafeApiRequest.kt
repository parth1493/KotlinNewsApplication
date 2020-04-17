package com.parth.kotlinnewsapplication.data.network

import com.parth.kotlinnewsapplication.utils.ApiException
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response

abstract class SafeApiRequest {

    suspend fun<T: Any> apiRequest(call: suspend () -> Response<T>) : T{
        val response = call.invoke()
        if(response.isSuccessful){
            return response.body()!!
        }else{

            val message = StringBuilder()

            message.append("Error Code: ${response.code()}")
            throw ApiException(message.toString())
        }
    }

}