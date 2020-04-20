package com.parth.kotlinnewsapplication.ui.kotlinnewslist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.parth.kotlinnewsapplication.R
import com.parth.kotlinnewsapplication.utils.Coroutines
import kotlinx.android.synthetic.main.activity_news_list.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance
class NewsListActivity : AppCompatActivity(),KodeinAware {

    override val kodein by kodein()
    private val factory: NewsViewModelFactory by instance()
    private lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list)

        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        this.setTitle(R.string.news_activity_name)
        buildUI()
    }

    private fun buildUI() = Coroutines.main {
        viewModel.children.await().observe(this, Observer { news ->
            recycler_view_news.also {
                it.layoutManager = LinearLayoutManager(applicationContext)
                it.setHasFixedSize(true)
//                it.adapter = NewsAdapter(news,this)
            }
        })
    }
}

