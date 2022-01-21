package com.bugcompany.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_oyun_sayfasi.view.*


class OyunSayfasiFragment : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle: OyunSayfasiFragmentArgs by navArgs()
        val gelenAd = bundle.isim
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekarmi = bundle.bekarMi

        val gelenNesneAd = bundle.nesne.isim
        val gelenNesneNo = bundle.nesne.numara

        Log.e("Ad", gelenAd)
        Log.e("Yaş", gelenYas.toString())
        Log.e("Boy", gelenBoy.toString())
        Log.e("Bekarmı", gelenBekarmi.toString())

        Log.e("Gelen Nesne Ad", gelenNesneAd)
        Log.e("Gelen Nesne Numara", gelenNesneNo.toString())


        val tasarim = inflater.inflate(R.layout.fragment_oyun_sayfasi, container, false)

        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_oyunSayfasiFragment_to_sonucSayfasiFragment)
        }
        return tasarim
    }


}
