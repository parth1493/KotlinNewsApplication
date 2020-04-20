package com.parth.kotlinnewsapplication.ui.baseactivity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.parth.kotlinnewsapplication.ui.listeners.ActionBarView

abstract class BaseActivity : AppCompatActivity(),ActionBarView {

    protected abstract fun initializeViewModel()
    abstract fun observeViewModel()
    protected abstract fun initViewBinding()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initViewBinding()
        initializeToolbar()
        initializeViewModel()
        observeViewModel()
    }

    private fun initializeToolbar() {
        TODO("Not yet implemented")
    }


    override fun setUpIconVisibility(visible: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setTitle(titleKey: String) {
        TODO("Not yet implemented")
    }

    override fun setSettingsIconVisibility(visibility: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setRefreshVisibility(visibility: Boolean) {
        TODO("Not yet implemented")
    }


}
