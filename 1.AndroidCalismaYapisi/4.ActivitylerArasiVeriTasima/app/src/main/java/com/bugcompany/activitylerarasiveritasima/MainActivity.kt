package com.bugcompany.activitylerarasiveritasima

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bugcompany.activitylerarasiveritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val kisi1=Kisiler(1212121,"Burak",1.78)

        binding.buttongonder.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("mesaj", "merhaba")
            intent.putExtra("yas", 23)
            intent.putExtra("boy", 1.68)

            intent.putExtra("kisi1",kisi1)
            startActivity(intent)


        }


    }
}