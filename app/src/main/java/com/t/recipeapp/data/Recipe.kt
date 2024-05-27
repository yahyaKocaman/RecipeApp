package com.t.recipeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val imageResourceId: Int,
    val ingredients: List<Ingredient>,
    val instructions: String,
    val calories: Int,
    val type: RecipeType
)