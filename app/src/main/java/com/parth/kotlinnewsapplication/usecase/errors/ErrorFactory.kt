package com.parth.kotlinnewsapplication.usecase.errors

import com.parth.kotlinnewsapplication.data.error.Error

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}