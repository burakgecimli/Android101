package com.bugcompany.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bugcompany.fragmentexample.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private var _binding: FragmentBirinciBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      _binding=FragmentBirinciBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            binding.textView.text=getString(R.string.merhaba_text)
        }
        return binding.root
    }


}