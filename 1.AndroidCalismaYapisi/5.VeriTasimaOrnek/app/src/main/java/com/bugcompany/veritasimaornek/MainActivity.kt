package com.bugcompany.veritasimaornek

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bugcompany.veritasimaornek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonGonder.setOnClickListener {
            val getName=binding.editTextPersonName.text.toString()

            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("name",getName)


            startActivity(intent)
        }
    }
}