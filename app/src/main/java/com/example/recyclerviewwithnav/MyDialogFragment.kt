package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.recyclerviewwithnav.adapter.FragmentItemAdapter
import com.example.recyclerviewwithnav.data.DialogFragmentDatasource
import com.example.recyclerviewwithnav.databinding.MyFragmentDialogBinding
import com.example.recyclerviewwithnav.interfaces.NumberedItemClickedListener

class MyDialogFragment: DialogFragment(), NumberedItemClickedListener {
    private lateinit var binding: MyFragmentDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = MyFragmentDialogBinding.inflate(inflater, container, false)

        val dialogView: View = binding.root

        val dialogFragmentDataset = DialogFragmentDatasource().loadFragmentItemModels()
        val dialogFragmentRecyclerView = binding.dialogFragmentRecyclerView
        dialogFragmentRecyclerView.adapter = FragmentItemAdapter(requireContext(), dialogFragmentDataset, this)

        binding.closeButton.setOnClickListener {
            dismiss()
        }

        return dialogView
    }

    override fun onNumberedItemClickedListener(pos: Int) {
        Toast.makeText(requireContext(),"Stavka " + (pos + 1).toString(), Toast.LENGTH_SHORT).show()
    }
}