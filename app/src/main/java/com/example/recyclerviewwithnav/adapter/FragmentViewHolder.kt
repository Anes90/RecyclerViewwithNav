package com.example.recyclerviewwithnav.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.model.ListItemModel
import kotlinx.android.synthetic.main.list_item_fragment.view.*

class FragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(listItemModel: ListItemModel) {
        itemView.item_title_fragment.text = listItemModel.stringTitle
        itemView.imageViewFragment.setImageResource(listItemModel.icon)
    }
}