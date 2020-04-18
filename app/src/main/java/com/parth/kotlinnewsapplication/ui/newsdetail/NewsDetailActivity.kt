package com.parth.kotlinnewsapplication.ui.newsdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isGone
import com.bumptech.glide.Glide
import com.parth.kotlinnewsapplication.R
import com.parth.kotlinnewsapplication.data.entities.Data
import kotlinx.android.synthetic.main.activity_news_detail.*
import kotlinx.android.synthetic.main.activity_news_detail.view.*

class NewsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val data:Data = intent.getParcelableExtra("extra_news")

        if(data.title.isNotBlank())
        {
            this.setTitle(data.title)
            titleData.text = "Title "+ data.title
        }
        else
        {
            titleData.visibility = View.GONE
        }

        if(data.selfText.isNullOrBlank())
        {
            selftext.visibility = View.GONE
        }
        else
        {
            selftext.text = "self Text "+ data.title
        }

        if(data.author.isNotBlank())
        {
            authorData.text = "Author " + data.author
        }
        else
        {
            authorData.visibility = View.GONE
        }

       if(data.thumbnail.isNullOrBlank())
       {
           imageView.visibility = View.GONE
       }
       else
       {
           Glide.with(imageView)
               .load(data.thumbnail)
               .into(imageView)
       }


    }
}
