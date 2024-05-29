
package com.t.recipeapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.t.recipeapp.data.Recipe

@Composable
fun RecipeDetailScreen(
    recipe: Recipe,
    viewModel: RecipeViewModel,
    modifier: Modifier = Modifier,
    isFavorite: Boolean,

) {

    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Display recipe details
        Image(
            painter = painterResource(id = recipe.imageResourceId),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = recipe.name, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Calories: ${recipe.calories}", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Type: ${recipe.type.name}", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Ingredients:", style = MaterialTheme.typography.headlineSmall)
        recipe.ingredients.forEach { ingredient ->
            Text(text = "- ${ingredient.quantity} ${ingredient.unit} ${ingredient.name}", style = MaterialTheme.typography.bodyMedium)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Your Ingredients:", style = MaterialTheme.typography.headlineSmall)
        viewModel.userIngredients.forEach { ingredient ->
            Text(text = "- ${ingredient.quantity} ${ingredient.unit} ${ingredient.name}", style = MaterialTheme.typography.bodyMedium)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Instructions:", style = MaterialTheme.typography.headlineSmall)
        Text(text = recipe.instructions, style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (isFavorite) {
                    viewModel.removeFavoriteRecipe(recipe.id)
                } else {
                    viewModel.addFavoriteRecipe(recipe.id)
                }
            }
        ) {
            Text(
                text = if (isFavorite) {
                    "Remove from Favorites"
                } else {
                    "Add to Favorites"
                }
            )


        }

    }
}
