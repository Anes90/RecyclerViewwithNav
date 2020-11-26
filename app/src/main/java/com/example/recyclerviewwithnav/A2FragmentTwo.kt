package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerviewwithnav.databinding.ActSecondFragTwoBinding

class A2FragmentTwo : Fragment() {
    private lateinit var binding: ActSecondFragTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActSecondFragTwoBinding.inflate(inflater, container, false)
        return binding.root
    }
}