package com.parth.kotlinnewsapplication.ui.splash

import android.content.Context
import com.parth.kotlinnewsapplication.data.error.mapper.ErrorMapper
import com.parth.kotlinnewsapplication.ui.baseactivity.BaseViewModel
import com.parth.kotlinnewsapplication.usecase.errors.ErrorManager


class SplashViewModel(
    private val context: Context
): BaseViewModel(){
    override val errorManager: ErrorManager
        get() = ErrorManager(ErrorMapper(context))
}
