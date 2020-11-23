package com.example.recyclerviewwithnav.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.databinding.ListItemActivityBinding
import com.example.recyclerviewwithnav.interfaces.CellClickListener
import com.example.recyclerviewwithnav.model.ListItemModel

class ActivityViewHolder(val binding: ListItemActivityBinding, val listener: CellClickListener) : RecyclerView.ViewHolder(binding.root) {
    fun bind(listItemModel: ListItemModel) {
        binding.listener = listener
        binding.toActivity = R.id.action_fragmentOne_to_secondActivity2
        //itemView.item_title_activity.text = listItemModel.stringTitle
        //itemView.imageViewActivity.setImageResource(listItemModel.icon)
        binding.itemTitleActivity.text = listItemModel.stringTitle
        binding.imageViewActivity.setImageResource(listItemModel.icon)
        binding.executePendingBindings()
    }
}