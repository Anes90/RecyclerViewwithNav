package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.databinding.ListItemFragmentBinding
import com.example.recyclerviewwithnav.interfaces.CellClickListener
import com.example.recyclerviewwithnav.model.ListItemModel

class FragmentViewHolder(val binding: ListItemFragmentBinding, val listener: CellClickListener) : RecyclerView.ViewHolder(binding.root) {
    fun bind(listItemModel: ListItemModel) {
        binding.listener = listener
        binding.toFragment = R.id.action_fragmentOne_to_fragmentTwo
        //itemView.item_title_fragment.text = listItemModel.stringTitle
        //itemView.imageViewFragment.setImageResource(listItemModel.icon)
        binding.itemTitleFragment.text = listItemModel.stringTitle
        binding.imageViewFragment.setImageResource(listItemModel.icon)
        binding.executePendingBindings()
    }
}