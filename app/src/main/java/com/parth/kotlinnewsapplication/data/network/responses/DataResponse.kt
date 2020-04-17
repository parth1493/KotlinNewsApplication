package com.parth.kotlinnewsapplication.data.network.responses

import com.parth.kotlinnewsapplication.data.entities.Children

data class DataResponse(
    var children: List<Children>
)