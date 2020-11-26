package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.ListItemBottomSheetBinding
import com.example.recyclerviewwithnav.interfaces.BottomSheetClickListener
import com.example.recyclerviewwithnav.model.ListItemModel

class BottomSheetViewHolder (val binding: ListItemBottomSheetBinding, val listener: BottomSheetClickListener) : RecyclerView.ViewHolder(binding.root) {
    fun bind(listItemModel: ListItemModel) {
        binding.listener = listener
        binding.bottomSheetTitle.text = listItemModel.stringTitle
        binding.bottomSheetIcon.setImageResource(listItemModel.icon)
        binding.executePendingBindings()
    }
}