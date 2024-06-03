package com.example.videostreamapp.di

import com.example.videostreamapp.VideoCallingApp
import com.example.videostreamapp.connect.ConnectViewModel
import com.example.videostreamapp.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}