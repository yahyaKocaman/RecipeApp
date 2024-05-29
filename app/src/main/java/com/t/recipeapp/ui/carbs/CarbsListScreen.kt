
package com.t.recipeapp.ui.carbs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.t.recipeapp.R
import com.t.recipeapp.carbRecipes
import com.t.recipeapp.getRandomSublist
import com.t.recipeapp.ui.RecipeImageButton

@Composable
fun CarbsListScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val randomCarbRecipes = if (carbRecipes.size >= 4) {
        carbRecipes.getRandomSublist(4)
    } else {
        carbRecipes
    }

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(randomCarbRecipes) { recipe ->
                RecipeImageButton(
                    recipe = recipe,
                    onButtonClick = { navController.navigate("carbs_detail/${recipe.id}") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}