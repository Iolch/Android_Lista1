package com.example.lista1q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
class LifeCycleActivity : AppCompatActivity() {

    private val TAG = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
    fun changeView(view: View) {
        // Do something in response to button click
        val myIntent = Intent(this, MainActivity::class.java)
        if(myIntent != null)    this.startActivity(myIntent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity Started")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity Stopped")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity Destroyed")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity Paused")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity Restarted")
    }
}
