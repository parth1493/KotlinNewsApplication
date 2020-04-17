package com.parth.kotlinnewsapplication

import android.app.Application
import com.parth.kotlinnewsapplication.data.network.MyApi
import com.parth.kotlinnewsapplication.data.network.NetworkConnectionInterceptor
import com.parth.kotlinnewsapplication.data.repositories.NewsRepository
import com.parth.kotlinnewsapplication.ui.kotlinnewslist.NewsViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class MVVMApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@MVVMApplication))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { MyApi(instance()) }
        bind() from singleton { NewsRepository(instance()) }
        bind() from provider { NewsViewModelFactory(instance()) }
    }

}