package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentTwo {
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}