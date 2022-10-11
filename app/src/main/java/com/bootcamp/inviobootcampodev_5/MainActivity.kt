package com.bootcamp.inviobootcampodev_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bootcamp.inviobootcampodev_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstNumber = 0
        var secondNumber = 0
        var current = -1


        binding.apply {

            numara0.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("0")
                else
                    editText.setText("${gelen}0")
            }
            numara1.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("1")
                else
                    editText.setText("${gelen}1")
            }
            numara2.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("2")
                else
                    editText.setText("${gelen}2")
            }
            numara3.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("3")
                else
                    editText.setText("${gelen}3")
            }
            numara4.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("4")
                else
                    editText.setText("${gelen}4")
            }
            numara5.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("5")
                else
                    editText.setText("${gelen}5")
            }
            numara6.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("6")
                else
                    editText.setText("${gelen}6")
            }
            numara7.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("7")
                else
                    editText.setText("${gelen}7")
            }
            numara8.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("8")
                else
                    editText.setText("${gelen}8")
            }
            numara9.setOnClickListener {
                val gelen = editText.text.toString()
                if (gelen == "0")
                    editText.setText("9")
                else
                    editText.setText("${gelen}9")
            }
            ac.setOnClickListener {
                editText.setText("0")
                firstNumber = 0
                secondNumber = 0
            }
            plus.setOnClickListener {
                firstNumber = editText.text.toString().toInt()
                editText.setText("")
                current = 0
            }
            minus.setOnClickListener {
                firstNumber = editText.text.toString().toInt()
                editText.setText("")
                current = 1
            }
            equals.setOnClickListener {
                secondNumber = editText.text.toString().toInt()
                when(current){
                    0 -> editText.setText(sum(firstNumber,secondNumber).toString())
                    1 -> editText.setText(min(firstNumber,secondNumber).toString())
                }
            }


        }


    }
    fun sum(firstN: Int, secondN: Int): Int {return firstN + secondN}

    fun min(firstN: Int, secondN: Int): Int {return firstN - secondN}
}