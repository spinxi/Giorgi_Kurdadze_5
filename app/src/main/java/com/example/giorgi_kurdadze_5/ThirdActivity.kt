
package com.example.giorgi_kurdadze_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val receivedName: String? = intent.getStringExtra("NAME");
        val receivedSurname: String? = intent.getStringExtra("SURNAME");


        val input: EditText = findViewById(R.id.identityNumber);
        val button: Button = findViewById(R.id.button);

        button.setOnClickListener{
            val inputText = input.text.toString();
            val intent = Intent(this@ThirdActivity, FourthActivity::class.java);
            intent.putExtra("IDNUMBER", inputText);
            intent.putExtra("SURNAME", receivedSurname);
            intent.putExtra("NAME", receivedName);
            startActivity(intent);
            finish();
        }
    }
}