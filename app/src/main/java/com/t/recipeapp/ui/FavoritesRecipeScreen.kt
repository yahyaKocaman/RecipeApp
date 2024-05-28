package com.t.recipeapp.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FavoriteRecipesScreen(
    viewModel: RecipeViewModel,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val favoriteRecipes by viewModel.favoriteRecipes.observeAsState(emptyList())

    LazyColumn(modifier = modifier) {
        items(favoriteRecipes) { favoriteRecipe ->
            val recipe = viewModel.getRecipeById(favoriteRecipe.recipeId)
            if (recipe != null) {
                RecipeCard(
                    recipe = recipe,
                    onCardClick = { navController.navigate("recipe_detail/${recipe.id}") }
                )
            }
        }
    }
}