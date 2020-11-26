package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerviewwithnav.databinding.ActSecondFragOneBinding

class A2FragmentOne : Fragment() {
    private lateinit var binding: ActSecondFragOneBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActSecondFragOneBinding.inflate(inflater, container, false)
        return binding.root
    }
}