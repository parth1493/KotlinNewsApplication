package com.parth.kotlinnewsapplication.ui.baseactivity

import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.parth.kotlinnewsapplication.R


abstract class BaseActivity : AppCompatActivity() {

    var refreshImage: ImageView? = null

    override
    fun setContentView(layoutResID: Int) {

        val constraintLayout =
                getLayoutInflater().inflate(R.layout.activity_base, null) as ConstraintLayout

        val frameLayout = constraintLayout.findViewById<FrameLayout>(R.id.activity_content)

        refreshImage = constraintLayout.findViewById(R.id.refresh_image)
        getLayoutInflater().inflate(layoutResID, frameLayout, true)

        super.setContentView(constraintLayout)
    }

    fun showRefreshImage(visible: Boolean) {
        refreshImage!!.visibility = if (visible) View.VISIBLE else View.GONE
    }

}
