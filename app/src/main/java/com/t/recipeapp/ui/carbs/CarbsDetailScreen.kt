
package com.t.recipeapp.ui.carbs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.t.recipeapp.data.FavoriteRecipe
import com.t.recipeapp.data.RecipeType
import com.t.recipeapp.ui.RecipeDetailScreen
import com.t.recipeapp.ui.RecipeViewModel


@Composable
fun CarbsDetailScreen(
    recipeId: Int,
    viewModel: RecipeViewModel,
    modifier: Modifier = Modifier,
    favoriteRecipes: List<FavoriteRecipe>
) {
    val recipe = viewModel.getRecipeById(recipeId)
    if (recipe != null && recipe.type == RecipeType.CARBS) {
        RecipeDetailScreen(
            recipe = recipe,
            viewModel = viewModel,
            modifier = modifier,
            isFavorite = favoriteRecipes.any { it.recipeId == recipeId }
        )
    }
}