package com.parth.kotlinnewsapplication.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    var id:String,
    var author:String,
    var selfText:String? = null,
    var title:String,
    var thumbnail: String? = null
) : Parcelable
