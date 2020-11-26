package com.example.recyclerviewwithnav

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.recyclerviewwithnav.adapter.FragmentItemAdapter
import com.example.recyclerviewwithnav.data.DialogFragmentDatasource
import com.example.recyclerviewwithnav.databinding.BottomSheetDialogFragmentBinding
import com.example.recyclerviewwithnav.interfaces.NumberedItemClickedListener
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetFragment: BottomSheetDialogFragment(), NumberedItemClickedListener {
    private lateinit var binding: BottomSheetDialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetDialogFragmentBinding.inflate(inflater, container, false)

        val bottomSheetView: View = binding.root

        val dialogFragmentDataset = DialogFragmentDatasource().loadFragmentItemModels()
        val dialogFragmentRecyclerView = binding.dialogFragmentRecyclerView
        dialogFragmentRecyclerView.adapter = FragmentItemAdapter(requireContext(), dialogFragmentDataset, this)
        Log.e("title", "1")

        return binding.root
    }
    override fun onNumberedItemClickedListener(pos: Int) {
        Toast.makeText(requireContext(),"Stavka " + (pos + 1).toString(), Toast.LENGTH_SHORT).show()
    }
}