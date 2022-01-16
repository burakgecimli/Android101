package com.bugcompany.fragmentkullanimi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/*
    • Activity'nin modüler bir bölümüdür.
    • Activity birden fazla Fragment’ı çalıştırabilir.
    • Her Fragment’ın kendine özgü tasarımı vardır.
    • Kendi yaşam döngüsü vardır, kendi giriş olaylarını (input events)  kendisi alır .
    • Activity çalışmaya devam ederken eklenip çıkarılabilir.
    • Activity’nin bütün özelliklerine sahiptir. Bu özelliklere getActivity() metodu ile ulaşılır.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.framelayout1, Fragment1())
        ft.add(R.id.framelayout2, Fragment2())

        ft.commit()


    }
}