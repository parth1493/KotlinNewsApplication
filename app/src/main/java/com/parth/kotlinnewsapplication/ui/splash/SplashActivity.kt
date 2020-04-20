package com.parth.kotlinnewsapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.parth.kotlinnewsapplication.databinding.ActivitySplashBinding
import com.parth.kotlinnewsapplication.ui.baseactivity.BaseActivity
import com.parth.kotlinnewsapplication.ui.kotlinnewslist.NewsListActivity
import com.parth.kotlinnewsapplication.utils.Constants
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class SplashActivity : BaseActivity(), KodeinAware {


    override val kodein by kodein()

    private val factory: SplashViewModelFactory by instance()

    private lateinit var binding: ActivitySplashBinding

    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToMainScreen()
    }

    override fun initViewBinding() {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun initializeViewModel() {
        viewModel = ViewModelProvider(this, factory).get(SplashViewModel::class.java)
    }

    override fun observeViewModel() {
    }

    private fun navigateToMainScreen() {
        Handler().postDelayed({
            val nextScreenIntent = Intent(this, NewsListActivity::class.java)
            startActivity(nextScreenIntent)
            finish()
        }, Constants.SPLASH_DELAY.toLong())
    }
}
