package com.example.recyclerviewwithnav.data

import com.example.recyclerviewwithnav.R
import com.example.recyclerviewwithnav.model.FragmentItemModel

class DialogFragmentDatasource {
    fun loadFragmentItemModels(): List<FragmentItemModel> {
        return listOf<FragmentItemModel>(
            FragmentItemModel("Fragment Item", R.drawable.ic_android_black_24dp),
            FragmentItemModel("Fragment Item", R.drawable.ic_android_black_24dp),
            FragmentItemModel("Fragment Item", R.drawable.ic_android_black_24dp),
            FragmentItemModel("Fragment Item", R.drawable.ic_android_black_24dp),
            FragmentItemModel("Fragment Item", R.drawable.ic_android_black_24dp)
        )
    }
}