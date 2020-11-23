package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.ListItemDialogFragmentBinding
import com.example.recyclerviewwithnav.interfaces.ItemClickListener
import com.example.recyclerviewwithnav.model.ListItemModel

class DialogFragmentViewHolder (val binding: ListItemDialogFragmentBinding, val listener: ItemClickListener) : RecyclerView.ViewHolder(binding.root) {
    fun bind(listItemModel: ListItemModel) {
        binding.listener = listener
        binding.itemTitleDialogFragment.text = listItemModel.stringTitle
        binding.imageViewDialogFragment.setImageResource(listItemModel.icon)
        binding.executePendingBindings()
    }
}