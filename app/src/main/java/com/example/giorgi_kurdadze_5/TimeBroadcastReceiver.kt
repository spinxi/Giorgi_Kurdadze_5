package com.example.giorgi_kurdadze_5

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class TimeBroadcastReceiver(private val textView: TextView) : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_TIME_TICK) {
            val intent = Intent(context, MainActivity::class.java);
            val currentTime = System.currentTimeMillis();
            intent.putExtra("CURRENT_TIME", currentTime);

            Log.d("TimeBroadcastReceiver", "Received broadcast. Updating time: $currentTime")
            textView.text = getCurrentTime();

        }
    }



    public fun getCurrentTime(): String {
        val currentTime = System.currentTimeMillis()
        val simpleDateFormat = SimpleDateFormat("HH:mm:ss")
        val date = Date(currentTime)
        return simpleDateFormat.format(date)
    }

}