package com.example.recyclerviewwithnav.adapter




import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.`interface`.CellClickListener
import com.example.recyclerviewwithnav.model.ListItemModel

class ItemAdapter(
        private val context: Context,
        private val dataset: List<ListItemModel>,
        private val cellClickListener: CellClickListener,
        private val toActivity: Int = R.id.action_fragmentOne_to_secondActivity2,
        private val toFragment: Int = R.id.action_fragmentOne_to_fragmentTwo
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textViewTitle: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textViewTitle.text =  context.resources.getString(item.stringTitleResourceId)
        if (position == 0) {
            holder.itemView.setOnClickListener {
                cellClickListener.onCellClickListener(toActivity)
            }
        }else {
            holder.itemView.setOnClickListener {
                cellClickListener.onCellClickListener(toFragment)
            }
        }
    }

    override fun getItemCount() = dataset.size
}