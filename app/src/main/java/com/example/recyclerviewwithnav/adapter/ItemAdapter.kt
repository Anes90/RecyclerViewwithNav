package com.example.recyclerviewwithnav.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithnav.databinding.ListItemActivityBinding
import com.example.recyclerviewwithnav.databinding.ListItemBottomSheetBinding
import com.example.recyclerviewwithnav.databinding.ListItemDialogFragmentBinding
import com.example.recyclerviewwithnav.databinding.ListItemFragmentBinding
import com.example.recyclerviewwithnav.interfaces.BottomSheetClickListener
import com.example.recyclerviewwithnav.interfaces.CellClickListener
import com.example.recyclerviewwithnav.interfaces.ItemClickListener
import com.example.recyclerviewwithnav.model.ListItemModel


// class ItemAdapter(
// private val context: Context,
// private val dataset: List<ListItemModel>,
// private val cellClickListener: CellClickListener,
// private val toActivity: Int = R.id.action_fragmentOne_to_secondActivity2,
// private val toFragment: Int = R.id.action_fragmentOne_to_fragmentTwo
// ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
// class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
// val iconView: ImageView = view.findViewById(R.id.imageViewActivity)
// val textViewTitle: TextView = view.findViewById(R.id.item_title_fragment)
// }
//
// override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
// val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item_activity, parent, false)
// return ItemViewHolder(adapterLayout)
// }
//
// override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
// val item = dataset[position]
// holder.iconView.setImageResource(item.iconResourceId)
// holder.textViewTitle.text =  context.resources.getString(item.stringTitleResourceId)
// if (position == 0) {
// holder.itemView.setOnClickListener {
// cellClickListener.onCellClickListener(toActivity)
// }
// }else {
// holder.itemView.setOnClickListener {
// cellClickListener.onCellClickListener(toFragment)
// }
// }
// }
//
// override fun getItemCount() = dataset.size
//
// getItemViewT
//
// override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) {
// return null
// }
//
// override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
// val item = dataset[position]
// holder.iconView.setImageResource(item.iconResourceId)
// holder.textViewTitle.text =  context.resources.getString(item.stringTitleResourceId)
// if (position == 0) {
// holder.itemView.setOnClickListener {
// cellClickListener.onCellClickListener(toActivity)
// }
// }else {
// holder.itemView.setOnClickListener {
// cellClickListener.onCellClickListener(toFragment)
// }
// }
// }
//
// override fun getItemCount() = dataset.size
// }

private const val ITEM_TYPE_ACTIVITY: Int = 0
private const val ITEM_TYPE_FRAGMENT: Int = 1
private const val ITEM_TYPE_DIALOG_FRAGMENT: Int = 2
private const val ITEM_TYPE_BOTTOM_SHEET: Int = 3

class ItemAdapter(
    private val context: Context,
        //var listItems: List<ListItemModel>,
    private val dataset: List<ListItemModel>,
    private val cellClickListener: CellClickListener,
    private val itemClickListener: ItemClickListener,
    private val bottomSheetClickListener: BottomSheetClickListener,
        //private val toActivity: Int = R.id.action_fragmentOne_to_secondActivity2,
        //private val toFragment: Int = R.id.action_fragmentOne_to_fragmentTwo
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == ITEM_TYPE_ACTIVITY) {
            //val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_activity, parent, false)
            //return ActivityViewHolder(view)
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListItemActivityBinding.inflate(inflater)
            return ActivityViewHolder(binding, cellClickListener)
        } else if (viewType == ITEM_TYPE_FRAGMENT) {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListItemFragmentBinding.inflate(inflater)
            return FragmentViewHolder(binding, cellClickListener)
        } else if (viewType == ITEM_TYPE_DIALOG_FRAGMENT){
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListItemDialogFragmentBinding.inflate(inflater)
            return DialogFragmentViewHolder(binding, itemClickListener)
        } else {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ListItemBottomSheetBinding.inflate(inflater)
            return BottomSheetViewHolder(binding, bottomSheetClickListener)
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (/*listItems*/dataset[position].item_type == 0) {
            return ITEM_TYPE_ACTIVITY
        } else if(dataset[position].item_type == 1){
            return ITEM_TYPE_FRAGMENT
        } else if(dataset[position].item_type == 2){
            return ITEM_TYPE_DIALOG_FRAGMENT
        } else {
            return ITEM_TYPE_BOTTOM_SHEET
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == ITEM_TYPE_ACTIVITY) {
            (holder as ActivityViewHolder).bind(/*listItems*/dataset[position])
                //cellClickListener.onCellClickListener(toActivity)
                //holder.binding.listener.onCellClickListener(toActivity)
                //holder.binding.setToActivity(toActivity)
        } else if(getItemViewType(position) == ITEM_TYPE_FRAGMENT) {
            (holder as FragmentViewHolder).bind(/*listItems*/dataset[position])

            //    cellClickListener.onCellClickListener(toFragment)
                //holder.binding.listener.onCellClickListener(toFragment)
                //holder.binding.setToFragment(toFragment)
        } else if(getItemViewType(position) == ITEM_TYPE_DIALOG_FRAGMENT){
            (holder as DialogFragmentViewHolder).bind(/*listItems*/dataset[position])
        } else {
            (holder as BottomSheetViewHolder).bind(/*listItems*/dataset[position])
        }
    }

    override fun getItemCount(): Int {
        return /*listItems*/dataset.size
    }
}