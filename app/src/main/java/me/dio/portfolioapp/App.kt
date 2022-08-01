package me.dio.portfolioapp

import android.app.Application
import me.dio.portfolioapp.data.di.DataModule
import me.dio.portfolioapp.domain.di.DomainModule
import me.dio.portfolioapp.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}