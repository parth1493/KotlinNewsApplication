package com.parth.kotlinnewsapplication.ui.kotlinnewslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.parth.kotlinnewsapplication.data.repositories.NewsRepository


@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(
    private val repository: NewsRepository
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(repository) as T
    }
}