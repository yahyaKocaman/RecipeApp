
package com.t.recipeapp.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.t.recipeapp.carbRecipes
import com.t.recipeapp.data.FavoriteRecipe
import com.t.recipeapp.data.Ingredient
import com.t.recipeapp.data.Recipe
import com.t.recipeapp.data.RecipeDao
import com.t.recipeapp.fatRecipes
import com.t.recipeapp.proteinRecipes
import kotlinx.coroutines.launch


class RecipeViewModel(private val recipeDao: RecipeDao, context: Context) : ViewModel() {
    private val allRecipes = carbRecipes + proteinRecipes + fatRecipes

    fun getRecipeById(recipeId: Int): Recipe? {
        return allRecipes.find { it.id == recipeId }
    }

    private val userId: Int = getUserIdFromPreferences(context)

    fun addFavoriteRecipe(recipeId: Int) {
        viewModelScope.launch {
            recipeDao.insertFavoriteRecipe(FavoriteRecipe(recipeId, userId))
        }
    }

    fun removeFavoriteRecipe(recipeId: Int) {
        viewModelScope.launch {
            recipeDao.deleteFavoriteRecipe(FavoriteRecipe(recipeId, userId))
        }
    }

    val favoriteRecipes = recipeDao.getFavoriteRecipesForUser(userId)

    private val _userIngredients = mutableListOf<Ingredient>()
    val userIngredients: List<Ingredient> = _userIngredients

    fun addUserIngredient(ingredient: Ingredient) {
        _userIngredients.add(ingredient)
    }

    private fun getUserIdFromPreferences(context: Context): Int {
        val sharedPreferences = context.getSharedPreferences("user_preferences", Context.MODE_PRIVATE)
        return sharedPreferences.getInt("user_id", 0)
    }
}
class RecipeViewModelFactory(private val recipeDao: RecipeDao, private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecipeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RecipeViewModel(recipeDao, context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}