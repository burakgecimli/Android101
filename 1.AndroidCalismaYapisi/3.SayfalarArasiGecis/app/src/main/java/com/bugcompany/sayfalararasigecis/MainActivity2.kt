package com.bugcompany.sayfalararasigecis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bugcompany.sayfalararasigecis.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main2)

        binding.buttonGit.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        //Bu Kodlar ile back tuşu ile uygulamadan tamamen çıkılır.
        val intent=Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME) //Ana ekrana dönmemizi sağlayan intent
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        startActivity(intent)

    }
}