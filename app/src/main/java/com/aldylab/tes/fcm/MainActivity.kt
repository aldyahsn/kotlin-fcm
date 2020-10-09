package com.aldylab.tes.fcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldylab.tes.fcm.fcm.Notif

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get token
        Notif.getToken(this)

    }
}