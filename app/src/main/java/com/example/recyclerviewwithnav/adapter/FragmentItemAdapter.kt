package com.example.recyclerviewwithnav.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.DialogFragmentSigleItemViewHolderBinding
import com.example.recyclerviewwithnav.interfaces.NumberedItemClickedListener
import com.example.recyclerviewwithnav.model.FragmentItemModel

class FragmentItemAdapter(
    private val context: Context,
    private val dialogFragmentDataset: List<FragmentItemModel>,
    private val numberedItemClickListener: NumberedItemClickedListener,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = DialogFragmentSigleItemViewHolderBinding.inflate(inflater)
            return DialogFragmentSingleItemViewHolder(binding, numberedItemClickListener)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as DialogFragmentSingleItemViewHolder).bind(dialogFragmentDataset[position])
    }

    override fun getItemCount(): Int {
        return dialogFragmentDataset.size
    }
}