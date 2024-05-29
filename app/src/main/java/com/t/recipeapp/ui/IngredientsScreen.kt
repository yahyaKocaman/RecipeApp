
package com.t.recipeapp.ui


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.t.recipeapp.data.Ingredient

@Composable
fun IngredientsScreen(
    viewModel: RecipeViewModel,
    modifier: Modifier = Modifier
) {
    val userIngredients = viewModel.userIngredients

    IngredientsScreenContent(
        userIngredients = userIngredients,
        onAddIngredient = { ingredientName ->
            viewModel.addUserIngredient(Ingredient(ingredientName, 1.0, "unit"))
        },
        modifier = modifier
    )
}