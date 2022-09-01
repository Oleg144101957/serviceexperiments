package com.example.serviceexperiments

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class MyService : Service() {

    private lateinit var player: MediaPlayer

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player.isLooping = true
        player.start()

    }

    override fun onStartCommand(init: Intent, flag: Int, startId: Int) : Int {


        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}