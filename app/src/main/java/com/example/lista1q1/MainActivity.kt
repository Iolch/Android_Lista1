package com.example.lista1q1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

import android.widget.Button;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent;
        val cont = intent.getStringExtra("contador");
        val b3: Button = findViewById(R.id.button_q3);
        if(cont != null)    b3.setText((cont.toInt()+1).toString());
    }

    fun changeView(view: View) {
        // Do something in response to button click
        val myIntent = when(view.id) {
            R.id.button_q1 -> Intent(this, ImageActivity::class.java)
            R.id.button_q2 -> Intent(this, LifeCycleActivity::class.java)
            R.id.button_q3 -> Intent(this, CounterActivity::class.java)
            else -> null
        }
        if(myIntent != null){

            if(view.id === R.id.button_q3)
            {
                val b3: Button = findViewById(R.id.button_q3);
                myIntent.putExtra("contador", b3.text);
            }
            this.startActivity(myIntent)
        }
    }
}
