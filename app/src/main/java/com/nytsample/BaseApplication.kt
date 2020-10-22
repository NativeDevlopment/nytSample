package com.nytsample

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication :Application() {

    init {
        /**
         * Application Instance
         */
        instance = this
      //  System.loadLibrary("api-keys")

    }

    companion object {
        private lateinit var instance: BaseApplication
        fun applicationContext(): Context {
            return instance.applicationContext
        }

        fun getInstance(): BaseApplication {
            return instance
        }
    }
 //   external fun getNytKey(): String

}