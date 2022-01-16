 package com.bugcompany.bindingkavrami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_yeni.*

 /*
     • Activity bir java sınıfıdır.
     • AppCompatActivity’den extend oland bir abstract sınıftır.
     • Abstract olduğu için override etmemiz gereken metodları vardır.
     • Layout’ların arka planında çalışır.
     • Her Activity’nin bir Layout’u vardır.
     • Her Activity AndroidManifest.xml dosyasında tanımlanmalıdır.
  */
class YeniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yeni)

        myButtonYeni.setOnClickListener {
            myTextViewYeni.text="Synthetic Binding Kullanıldı"
        }








    }
}