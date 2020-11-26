package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerviewwithnav.databinding.ActSecondFragThreeBinding

class A2FragmentThree : Fragment() {
    private lateinit var binding: ActSecondFragThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActSecondFragThreeBinding.inflate(inflater, container, false)

        binding.imageViewUri = "https://cdn.spacetelescope.org/archives/images/screen/heic1808a.jpg"

        return binding.root
    }
}