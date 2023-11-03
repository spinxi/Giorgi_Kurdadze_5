package com.example.giorgi_kurdadze_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val receivedName: String? = intent.getStringExtra("NAME");


        val input: EditText  = findViewById(R.id.surnameText);
        val button: Button  = findViewById(R.id.button);

        button.setOnClickListener{
            val inputText = input.text.toString();
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java);
            intent.putExtra("NAME", receivedName);
            intent.putExtra("SURNAME", inputText);
            startActivity(intent);
            finish();
        }
    }
}