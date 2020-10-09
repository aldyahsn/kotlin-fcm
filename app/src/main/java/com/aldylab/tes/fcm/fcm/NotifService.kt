package com.aldylab.tes.fcm.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class NotifService:FirebaseMessagingService(){
    
    val TAG:String = "FCM-NOTIFSERVICE"
    
    override fun onMessageReceived(_msg: RemoteMessage) {
        Log.d(TAG, "onMessageReceived: ")

        // Check if message contains a data payload.
        if (_msg.data.size > 0) {
            Log.d(TAG, "Message data payload: " + _msg.data);
        }

        // Check if message contains a notification payload.
        if (_msg.notification != null) {
            Log.d(TAG, "onMessageReceived: notification is available")
        }
        
    }
}