package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.ListItemFragmentBinding
import com.example.recyclerviewwithnav.model.ListItemModel

class FragmentViewHolder(val binding: ListItemFragmentBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(listItemModel: ListItemModel) {
        //itemView.item_title_fragment.text = listItemModel.stringTitle
        //itemView.imageViewFragment.setImageResource(listItemModel.icon)
        binding.itemTitleFragment.text = listItemModel.stringTitle
        binding.imageViewFragment.setImageResource(listItemModel.icon)
        binding.executePendingBindings()
    }
}