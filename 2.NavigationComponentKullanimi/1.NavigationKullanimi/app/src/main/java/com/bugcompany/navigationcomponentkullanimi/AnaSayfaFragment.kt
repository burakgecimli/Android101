package com.bugcompany.navigationcomponentkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ana_sayfa.view.*


class AnaSayfaFragment : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_ana_sayfa, container, false)

        tasarim.buttonBasla.setOnClickListener {

            val kisi = Kisiler("Ekin", 1)
            val gecis = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToOyunSayfasiFragment(
                "Burak",
                23,
                1.78F,
                true,
                kisi


            )

            Navigation.findNavController(it).navigate(gecis)

        }
        return tasarim
    }


}
