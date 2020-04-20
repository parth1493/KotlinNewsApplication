package com.parth.kotlinnewsapplication.data.error.mapper

import android.content.Context
import com.parth.kotlinnewsapplication.R
import com.parth.kotlinnewsapplication.data.error.Error

class ErrorMapper(
    private var context: Context
) : ErrorMapperInterface {

    override fun getErrorString(errorId: Int): String {
        return context.getString(errorId)
    }

    override val errorsMap: Map<Int, String>
        get() = mapOf(
                Pair(Error.NO_INTERNET_CONNECTION, getErrorString(R.string.no_internet)),
                Pair(Error.NETWORK_ERROR, getErrorString(R.string.network_error))
        ).withDefault { getErrorString(R.string.network_error) }
}