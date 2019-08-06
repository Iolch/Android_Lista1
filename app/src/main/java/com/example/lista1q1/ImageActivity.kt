package com.example.lista1q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
    }
    fun changeView(view: View) {
        // Do something in response to button click
        val myIntent = Intent(this, MainActivity::class.java)
        this.startActivity(myIntent)
    }
}
