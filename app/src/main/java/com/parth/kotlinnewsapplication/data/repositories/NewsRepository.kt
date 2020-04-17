package com.parth.kotlinnewsapplication.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.parth.kotlinnewsapplication.data.entities.Children
import com.parth.kotlinnewsapplication.data.network.MyApi
import com.parth.kotlinnewsapplication.data.network.SafeApiRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsRepository(
    private val api: MyApi
): SafeApiRequest() {
    private val news = MutableLiveData<List<Children>>()

    suspend fun getQuotes(): LiveData<List<Children>> {
        return withContext(Dispatchers.IO) {
            fetchQuotes()
            news
        }
    }

    private suspend fun fetchQuotes() {
        val response = apiRequest { api.getQuotes() }
        news.postValue(response.data.children)
    }

}