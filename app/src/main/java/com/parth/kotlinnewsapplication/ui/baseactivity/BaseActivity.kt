package com.parth.kotlinnewsapplication.ui.baseactivity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.parth.kotlinnewsapplication.databinding.ToolbarBinding
import com.parth.kotlinnewsapplication.ui.listeners.ActionBarView

abstract class BaseActivity : AppCompatActivity(),ActionBarView {

    protected lateinit var baseViewModel: BaseViewModel

    protected lateinit var toolbarBinding: ToolbarBinding

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
        toolbarBinding = ToolbarBinding.inflate(layoutInflater)
        toolbarBinding.txtToolbarTitle.text = ""
    }

    override fun setUpIconVisibility(visible: Boolean) {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(visible)
    }

    override fun setTitle(titleKey: String) {
        toolbarBinding.txtToolbarTitle.text = titleKey
    }

    override fun setSettingsIconVisibility(visibility: Boolean) {
        toolbarBinding.icToolbarSetting.visibility = if (visibility) View.VISIBLE else View.GONE
    }

    override fun setRefreshVisibility(visibility: Boolean) {
        toolbarBinding.icToolbarRefresh.visibility = if (visibility) View.VISIBLE else View.GONE
    }
}
