package com.parth.kotlinnewsapplication.ui.listeners

interface ActionBarView {

    fun setUpIconVisibility(visible: Boolean)

    fun setTitle(titleKey: String)

    fun setSettingsIconVisibility(visibility: Boolean)

    fun setRefreshVisibility(visibility: Boolean)

}