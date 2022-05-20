package com.itis.foody.features.recipe.data.response.recipeInfo


import com.google.gson.annotations.SerializedName

data class Step(
    @SerializedName("equipment")
    val equipment: List<Equipment>?,
    @SerializedName("ingredients")
    val ingredients: List<Ingredient>?,
    @SerializedName("length")
    val length: Length?,
    @SerializedName("number")
    val number: Int,
    @SerializedName("step")
    val step: String
)
