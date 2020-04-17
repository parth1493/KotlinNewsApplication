package com.parth.kotlinnewsapplication.ui.kotlinnewslist

import androidx.lifecycle.ViewModel
import com.parth.kotlinnewsapplication.data.repositories.NewsRepository
import com.parth.kotlinnewsapplication.utils.lazyDeferred

class NewsViewModel (
    repository: NewsRepository
) : ViewModel() {

    val children by lazyDeferred {
        repository.getQuotes()
    }
}