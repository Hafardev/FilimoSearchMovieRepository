package com.filimo.searchmovie

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class FilimoApplication @Inject constructor() : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
       MultiDex.install(this)
    }
}