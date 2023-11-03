package com.example.giorgi_kurdadze_5

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date


class MainActivity : AppCompatActivity() {
    lateinit var input: EditText;
    lateinit var button:Button;

    private lateinit var timeReceiver: TimeBroadcastReceiver;
    private lateinit var timeTextView: TextView;





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input  = findViewById(R.id.nameText);
        button  = findViewById(R.id.button);
        timeTextView = findViewById(R.id.textView2);

        button.setOnClickListener{
            val inputText = input.text.toString();
            val intent = Intent(this@MainActivity, SecondActivity::class.java);
            intent.putExtra("NAME", inputText);
            startActivity(intent);
            finish();
        }


        timeReceiver = TimeBroadcastReceiver(timeTextView);

        timeTextView.text = timeReceiver.getCurrentTime();


        registerReceiver(timeReceiver, IntentFilter(Intent.ACTION_TIME_TICK));

    }


    override fun onDestroy() {
        unregisterReceiver(timeReceiver)
        super.onDestroy()
    }



}
