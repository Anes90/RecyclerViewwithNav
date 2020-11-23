package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerviewwithnav.databinding.FragmentTwoBinding

class FragmentTwo : Fragment(){
    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(inflater, container, false)

        binding.secondFragmentTitle = "Welcome to Fragment Two"

        return binding.root
    }
}