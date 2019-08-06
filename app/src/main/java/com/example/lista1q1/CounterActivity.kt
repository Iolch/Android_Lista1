package com.example.lista1q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CounterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val intent = intent;
        val cont = intent.getStringExtra("contador");
        val b: Button = findViewById(R.id.button);
        b.setText((cont.toInt()+1).toString()); //Setando o valor + 1
    }

    fun changeView(view: View) {
        // Do something in response to button click
        val b: Button = findViewById(R.id.button);
        val myIntent = Intent(this, MainActivity::class.java)
        myIntent.putExtra("contador", b.text)
        this.startActivity(myIntent)
    }
}
