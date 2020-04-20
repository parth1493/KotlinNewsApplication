package com.parth.kotlinnewsapplication.ui.kotlinnewslist

import android.R.id
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.parth.kotlinnewsapplication.R
import com.parth.kotlinnewsapplication.data.entities.Children
import com.parth.kotlinnewsapplication.databinding.NewsListViewBinding
import com.parth.kotlinnewsapplication.ui.newsdetail.NewsDetailActivity


class NewsAdapter
//    (
//    private val newsList: List<Children>,
//    private  val context: Context
//) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
//
//    override fun getItemCount() = newsList.size
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
//        NewsViewHolder(
//            DataBindingUtil.inflate<NewsListViewBinding>(
//                LayoutInflater.from(parent.context),
//                R.layout.news_list_view,
//                parent,
//                false
//            )
//        )
//
//    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
//        holder.recyclerviewNewsListViewBinding.children = newsList[position]
//        holder.recyclerviewNewsListViewBinding.root.setOnClickListener {
//
//            val intent = Intent(context, NewsDetailActivity::class.java)
//            intent.putExtra("extra_news", newsList[position].data)
//            context.startActivity(intent)
//        }
//
//    }
//
//    inner class NewsViewHolder(
//        val recyclerviewNewsListViewBinding: NewsListViewBinding
//    ) :RecyclerView.ViewHolder(recyclerviewNewsListViewBinding.root)
//
//}