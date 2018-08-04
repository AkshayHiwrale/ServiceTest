package com.akandro.www.servicetest

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.MediaController

/**
  * Created by akshay on 8/4/2018.
 */
class Myservice:Service(){
    override fun onBind(p0: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    var mPlayer:MediaPlayer? =null

    override fun onCreate() {
        super.onCreate()

         mPlayer = MediaPlayer.create(this,R.raw.mere)




    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mPlayer!!.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPlayer!!.stop()
    }

}