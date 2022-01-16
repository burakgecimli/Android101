package com.bugcompany.navigationcomponentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
    • Sayfa geçişlerini daha görsel ve pratik hale getiren bir yapıdır.
    • Activity üzerinde istediğimiz şekilde fragment geçişleri yapabiliriz.
    • Geçişlerde veri transferi yapabiliriz.
    • Geçişlere animasyon ekleyebiliriz.
    • Birden fazla activityde kullanılabilir ama her activity için ayrı navigation dosyası oluşturmalıyız.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}