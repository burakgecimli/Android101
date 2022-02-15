package com.bugcompany.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bugcompany.fragmentexample.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {
    private var _binding: FragmentIkinciBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding= FragmentIkinciBinding.inflate(inflater, container, false)
        binding.button2.setOnClickListener {
            binding.textView.text=getString(R.string.textview)
        }
        return binding.root
    }


}






