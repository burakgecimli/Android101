package com.bugcompany.bindingkavrami

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() { // Kotlin sınıfı AppCompatActivity()’den extend edilir.
    private lateinit var myTextView: TextView
    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // onCreate() metodu oluşturulur.
        setContentView(R.layout.activity_main) // Layout Activity’e bağlanır.

        //*** Eski Yöntem ***
        myTextView=findViewById(R.id.myTextView)
        myButton=findViewById(R.id.myButton)


        myButton.setOnClickListener {
            myTextView.text="Find View By Id Eski Yöntem Kullanıldı"
        }








    }
}