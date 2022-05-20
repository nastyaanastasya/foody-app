package com.itis.foody.common.db.entities

import android.graphics.Bitmap

data class Ingredient(
    var name: String,
    var amount: String,
    var image: Bitmap
)
