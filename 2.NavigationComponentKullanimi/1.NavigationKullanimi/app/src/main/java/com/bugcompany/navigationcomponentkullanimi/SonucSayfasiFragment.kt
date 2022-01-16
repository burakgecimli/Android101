package com.bugcompany.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SonucSayfasiFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

       val tasarim=inflater.inflate(R.layout.fragment_sonuc_sayfasi, container, false)
        return tasarim
    }


}