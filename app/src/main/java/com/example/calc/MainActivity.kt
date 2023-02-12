package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){
            btn1.setOnClickListener {
                disp.text = disp.text.toString() + "1"
            }
            btn2.setOnClickListener {
                disp.text = disp.text.toString() + "2"
            }
            btn3.setOnClickListener {
                disp.text = disp.text.toString() + "3"
            }
            btn4.setOnClickListener {
                disp.text = disp.text.toString() + "4"
            }
            btn5.setOnClickListener {
                disp.text = disp.text.toString() + "5"
            }
            btn6.setOnClickListener {
                disp.text = disp.text.toString() + "6"
            }
            btn7.setOnClickListener {
                disp.text = disp.text.toString() + "7"
            }
            btn8.setOnClickListener {
                disp.text = disp.text.toString() + "8"
            }
            btn9.setOnClickListener {
                disp.text = disp.text.toString() + "9"
            }
         }
    }
}