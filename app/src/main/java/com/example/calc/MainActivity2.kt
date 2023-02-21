package com.example.calc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        timerIntent()
    }
    fun timerIntent(){
        val timeTask = timerTask {
            val intents = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intents)
        }
        val timer = Timer()
        timer.schedule(timeTask,5000)
    }
}


