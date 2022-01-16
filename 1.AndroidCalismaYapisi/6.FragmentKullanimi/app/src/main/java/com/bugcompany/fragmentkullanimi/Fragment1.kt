package com.bugcompany.fragmentkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.view.*

class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootview=inflater.inflate(R.layout.fragment1,container,false)

        rootview.buttonTikla.setOnClickListener {
            Toast.makeText(activity,"Tıklandı",Toast.LENGTH_LONG).show()
        }


        return rootview
    }
}