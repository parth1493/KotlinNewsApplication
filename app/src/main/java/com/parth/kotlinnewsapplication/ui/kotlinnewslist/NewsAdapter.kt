package com.parth.kotlinnewsapplication.ui.kotlinnewslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.parth.kotlinnewsapplication.R
import com.parth.kotlinnewsapplication.data.entities.Children
import com.parth.kotlinnewsapplication.databinding.NewsListViewBinding

class NewsAdapter(
    private val newsList: List<Children>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun getItemCount() = newsList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        NewsViewHolder(
            DataBindingUtil.inflate<NewsListViewBinding>(
                LayoutInflater.from(parent.context),
                R.layout.news_list_view,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.recyclerviewNewsListViewBinding.children = newsList[position]
    }

    inner class NewsViewHolder(
        val recyclerviewNewsListViewBinding: NewsListViewBinding
    ) :RecyclerView.ViewHolder(recyclerviewNewsListViewBinding.root)
}