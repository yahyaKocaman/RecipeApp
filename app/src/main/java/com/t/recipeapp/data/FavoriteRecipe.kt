package com.t.recipeapp.data

import androidx.room.Entity

@Entity(tableName = "favorite_recipes", primaryKeys = ["recipeId", "userId"])
data class FavoriteRecipe(
    val recipeId: Int,
    val userId: Int
)
