package com.parth.kotlinnewsapplication.ui.baseactivity

import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.parth.kotlinnewsapplication.R


abstract class BaseActivity : AppCompatActivity() {

    var mProgressBar: ProgressBar? = null

    override
    fun setContentView(layoutResID: Int) {

        val constraintLayout =
                getLayoutInflater().inflate(R.layout.activity_base, null) as ConstraintLayout

        val frameLayout = constraintLayout.findViewById<FrameLayout>(R.id.activity_content)

        mProgressBar = constraintLayout.findViewById(R.id.progress_bar)

        getLayoutInflater().inflate(layoutResID, frameLayout, true)

        super.setContentView(constraintLayout)
    }

    fun showProgressBar(visible: Boolean) {
    mProgressBar!!.visibility = if (visible) View.VISIBLE else View.INVISIBLE
    }

}
