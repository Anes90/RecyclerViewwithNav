package com.example.recyclerviewwithnav.data
import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.model.ListItemModel

class Datasource (){
    fun loadListItemModels(): List<ListItemModel> {
        return listOf<ListItemModel>(
            ListItemModel(R.string.title_activity),
            ListItemModel(R.string.title_fragment),
        )
    }
}