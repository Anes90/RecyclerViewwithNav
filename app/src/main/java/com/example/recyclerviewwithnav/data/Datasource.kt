package com.example.recyclerviewwithnav.data
import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.model.ListItemModel

class Datasource (){
    fun loadListItemModels(): List<ListItemModel> {
        return listOf<ListItemModel>(
            //ListItemModel(R.string.title_activity, R.drawable.ic_android_black_24dp, item_type = 0),
            //ListItemModel(R.string.title_fragment, R.drawable.ic_baseline_phone_android_24, item_type = 1),
            ListItemModel("Go to second activity", R.drawable.ic_baseline_phone_android_24, item_type = 0),
            ListItemModel("Go to second fragment", R.drawable.ic_android_black_24dp, item_type = 1),
            ListItemModel("Activate dialog fragment", R.drawable.ic_baseline_person_24, item_type = 2),
            ListItemModel("Activate bottom sheet dialog fragment", R.drawable.ic_baseline_pets_24, item_type = 3),
        )
    }
}