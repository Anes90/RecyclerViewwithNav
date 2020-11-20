package com.example.recyclerviewwithnav.model


data class ListItemModel(
        //@StringRes val stringTitleResourceId: Int,
        //@DrawableRes val iconResourceId: Int,
        val stringTitle: String,
        val icon: Int,
        var item_type: Int
)