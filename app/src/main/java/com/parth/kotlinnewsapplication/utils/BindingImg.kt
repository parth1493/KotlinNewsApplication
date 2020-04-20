package com.parth.kotlinnewsapplication.utils

import android.widget.ImageView
import com.amulyakhare.textdrawable.TextDrawable
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.bumptech.glide.Glide
import com.parth.kotlinnewsapplication.data.entities.Data



fun loadImage(view: ImageView, data: Data) {

    if (data.thumbnail!!.isNotBlank())
    {
        Glide.with(view)
            .load(data.thumbnail)
            .into(view)
    }
    else
    {
        val generator = ColorGenerator.MATERIAL
        val color: Int = generator.getRandomColor()
        val drawable = TextDrawable.builder()
            .beginConfig()
            .fontSize(30)
            .withBorder(10)
            .endConfig()
            .buildRect(data.title, color)

        view.setImageDrawable(drawable)
    }

}