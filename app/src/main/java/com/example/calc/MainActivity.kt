package com.example.calc

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.calc.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){
            ze.setOnClickListener {
                disp.text = disp.text.toString() + "0"
            }
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

            oppl.setOnClickListener {
                disp.text = disp.text.toString() + "+"
            }
            opmod.setOnClickListener {
                disp.text = disp.text.toString() + "%"
            }
            opst.setOnClickListener {
                disp.text = disp.text.toString() + "*"
            }
            opsl.setOnClickListener {
                disp.text = disp.text.toString() + "/"
            }
            oppow.setOnClickListener {
                disp.text = disp.text.toString() + "^"
            }
            opmi.setOnClickListener {
                disp.text = disp.text.toString() + "-"
            }

            clr.setOnClickListener {
                disp.text = ""
                disp.hint = "0."
            }
            dec.setOnClickListener {
                disp.text = disp.text.toString() + "."
            }
            back.setOnClickListener {
                if(disp.text.toString().length > 0)
                {
                    disp.text = (disp.text.toString()).subSequence(0, disp.text.toString().length-1)
                }
                else
                {
                    disp.hint = "0."
                    disp.text = ""
                }
            }
            opeq.setOnClickListener {
                val exp = disp.text.toString()
                if(exp.isNotEmpty()){
                    val expbuild = ExpressionBuilder(exp).build()
                    try {
                        val result = expbuild.evaluate()
                        disp.text = result.toString()
                    }
                    catch (e: java.lang.IllegalArgumentException){
                        Toast.makeText(this@MainActivity, "You never disappoint to disappoint", Toast.LENGTH_SHORT).show()
                    }
                }
                else
                {
                    Toast.makeText(this@MainActivity, "Can't Evaluate empty Expression", Toast.LENGTH_SHORT).show()
                }

            }
         }
    }
}