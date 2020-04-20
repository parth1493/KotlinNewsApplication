package com.parth.kotlinnewsapplication.usecase.errors

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}