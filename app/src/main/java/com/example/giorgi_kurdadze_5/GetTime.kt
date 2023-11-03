//package com.example.giorgi_kurdadze_5
//
//import android.content.BroadcastReceiver
//import android.content.Context
//import android.content.Intent
//import android.content.IntentFilter
//
//
//class GetTime(context: Context) {
//
//
//    private val broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
//        override fun onReceive(context: Context?, intent: Intent?) {
//            if (intent?.action == "GET_CURRENT_TIME") {
//                val currentTime = getCurrentTime()
//                // Display or use the current time as needed
//                Toast.makeText(context, "Current Time: $currentTime", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        private fun getCurrentTime(): String {
//            val currentTime = System.currentTimeMillis()
//            val simpleDateFormat = SimpleDateFormat("HH:mm:ss")
//            val date = Date(currentTime)
//            return simpleDateFormat.format(date)
//        }
//    }
//    var currentTime: Long = 0
//
//
//}
