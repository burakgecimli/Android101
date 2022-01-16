package com.bugcompany.activitylerarasiveritasima

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val getMessage = intent.getStringExtra("mesaj")
        val getAge = intent.getIntExtra("yas", 0)
        val getBoy = intent.getDoubleExtra("boy", 0.0)

        val getKisi = intent.getSerializableExtra("kisi1") as Kisiler

        Log.e("  Mesaj", getMessage.toString())
        Log.e("  Yaş", getAge.toString())
        Log.e("  Boy", getBoy.toString())

        Log.e("  Kişi Tc No", getKisi.tcNo.toString())
        Log.e("  Kişi Ad", getKisi.isim)
        Log.e("  Kişi Boy", getKisi.boy.toString())
    }
}