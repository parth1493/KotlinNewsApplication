package com.parth.kotlinnewsapplication.ui.baseactivity

import androidx.lifecycle.ViewModel
import com.parth.kotlinnewsapplication.usecase.errors.ErrorManager


abstract class BaseViewModel : ViewModel() {
    /**Inject Singlton ErrorManager
     * Use this errorManager to get the Errors
     */
    abstract val errorManager: ErrorManager

}
