package com.example.giorgi_kurdadze_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val receivedName: String? = intent.getStringExtra("NAME");
        val receivedSurname: String? = intent.getStringExtra("SURNAME");
        val receivedIdNumber: String? = intent.getStringExtra("IDNUMBER");


        var textFinal: TextView = findViewById(R.id.textView);

        textFinal.text = "Name: $receivedName  Surname: $receivedSurname IDNumber: $receivedIdNumber";

    }
}