package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.DialogFragmentSigleItemViewHolderBinding
import com.example.recyclerviewwithnav.interfaces.NumberedItemClickedListener
import com.example.recyclerviewwithnav.model.FragmentItemModel

class DialogFragmentSingleItemViewHolder (val binding: DialogFragmentSigleItemViewHolderBinding, val listener: NumberedItemClickedListener) : RecyclerView.ViewHolder(binding.root){
    fun bind(listItemModel: FragmentItemModel) {
        binding.listener = listener
        binding.itemNo = adapterPosition
        binding.dialogFragmentItemTitle.text = listItemModel.dialogFragmentTitle
        binding.dialogFragmentItemIcon.setImageResource(listItemModel.dialogFragmentIcon)
        binding.executePendingBindings()
    }
}