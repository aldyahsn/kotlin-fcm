package com.aldylab.tes.fcm.fcm
import android.content.Context
import android.provider.Settings.Global.getString
import android.util.Log
import android.widget.Toast
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.iid.FirebaseInstanceId


class Notif {

    companion object {

        const val TAG:String = "Notif"

        fun getToken(_context: Context) {
            FirebaseInstanceId.getInstance().instanceId
                .addOnCompleteListener(OnCompleteListener { task ->
                    if (!task.isSuccessful) {
                        Log.w(TAG, "getInstanceId failed", task.exception)
                        return@OnCompleteListener
                    }
                    task.result?.token?.let { Log.d("TOKEN", it) }
                    Toast.makeText(_context, "", Toast.LENGTH_SHORT).show()
                })
        }

        fun checkGooglePlayServices(_context:Context): Boolean {
            val status = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(_context)
            return if (status != ConnectionResult.SUCCESS) {
                Log.e(TAG, "Error")
                false
            } else {
                Log.i(TAG, "Google play services updated")
                true
            }
        }
    }

}