package com.parth.kotlinnewsapplication.usecase.errors

import com.parth.kotlinnewsapplication.data.error.mapper.ErrorMapper
import com.parth.kotlinnewsapplication.data.error.Error

class ErrorManager (
    private val errorMapper: ErrorMapper) : ErrorFactory {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode,description = errorMapper.errorsMap.getValue(errorCode))
    }

}