package com.bugcompany.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bugcompany.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.textViewResult.text = ""

        binding.buttonToplama.setOnClickListener {
            val num1 = binding.editTextNum1.text.toString()
            val num2 = binding.editTextNum2.text.toString()

            var result = num1.toInt() + num2.toInt()

            binding.textViewResult.text=result.toString()
        }

        binding.buttonCarpma.setOnClickListener {
            val num1 = binding.editTextNum1.text.toString()
            val num2 = binding.editTextNum2.text.toString()

            var result = num1.toInt() * num2.toInt()

            binding.textViewResult.text=result.toString()
        }


    }
}