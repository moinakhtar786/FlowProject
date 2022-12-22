package com.example.flowproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val helloWorld = findViewById<TextView>(R.id.helloWorld)

        // creating/launching a coroutine will return the job

        // coroutine launched in GlobalScope
//        val jobs = CoroutineScope(Dispatchers.IO).launch {
//            Log.e("helloworld", Thread.currentThread().name.toString())
//            for (nums in 0..10000) {
//                Log.d("helloworld", "Coroutines is still working $nums")
//                // delay the coroutine by 1sec
//                delay(1000)
//            }
//        }

        Log.e("helloworld", Thread.currentThread().name.toString())
//
//        helloWorld.setOnClickListener {
////            val intent = Intent(this, MainActivity2 :: class.java)
////            startActivity(intent)
////            finish()
//            jobs.cancel()
//
//        }

    }
}