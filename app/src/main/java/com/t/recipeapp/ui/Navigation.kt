package com.t.recipeapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.t.recipeapp.ui.carbs.CarbsDetailScreen
import com.t.recipeapp.ui.carbs.CarbsListScreen
import com.t.recipeapp.ui.fats.FatsDetailScreen
import com.t.recipeapp.ui.fats.FatsListScreen
import com.t.recipeapp.ui.protein.ProteinsDetailScreen
import com.t.recipeapp.ui.protein.ProteinsListScreen

@Composable
fun Navigation(
    navController: NavHostController,
    modifier: Modifier,
    viewModel: RecipeViewModel
) {
    val favoriteRecipes by viewModel.favoriteRecipes.observeAsState(emptyList())

    NavHost(navController = navController, startDestination = "recipe_list") {
        composable("recipe_list") {
            RecipeListScreen(
                viewModel = viewModel,
                modifier = modifier,
                navController = navController
            )
        }
        composable("recipe_types") {
            RecipeTypesScreen(
                navController = navController,
                modifier = modifier
            )
        }
        composable("carbs") {
            CarbsListScreen(
                navController = navController,
                modifier = modifier
            )
        }
        composable(
            route = "carbs_detail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getInt("recipeId")
            if (recipeId != null) {
                CarbsDetailScreen(
                    recipeId = recipeId,
                    viewModel = viewModel,
                    modifier = modifier,
                    favoriteRecipes = favoriteRecipes
                )
            }
        }
        composable("proteins") {
            ProteinsListScreen(
                navController = navController,
                modifier = modifier
            )
        }
        composable(
            route = "proteins_detail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getInt("recipeId")
            if (recipeId != null) {
                ProteinsDetailScreen(
                    recipeId = recipeId,
                    viewModel = viewModel,
                    modifier = modifier,
                    favoriteRecipes = favoriteRecipes
                )
            }
        }
        composable("fats") {
            FatsListScreen(
                navController = navController,
                modifier = modifier
            )
        }
        composable(
            route = "fats_detail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getInt("recipeId")
            if (recipeId != null) {
                FatsDetailScreen(
                    recipeId = recipeId,
                    viewModel = viewModel,
                    modifier = modifier,
                    favoriteRecipes = favoriteRecipes
                )
            }
        }
        composable("favorite_recipes") {
            FavoriteRecipesScreen(
                viewModel = viewModel,
                navController = navController,
                modifier = modifier
            )
        }
        composable(
            route = "recipe_detail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getInt("recipeId")
            if (recipeId != null) {
                val recipe = viewModel.getRecipeById(recipeId)
                if (recipe != null) {
                    RecipeDetailScreen(
                        recipe = recipe,
                        viewModel = viewModel,
                        modifier = modifier,
                        isFavorite = favoriteRecipes.any { it.recipeId == recipeId }
                    )
                }
            }
        }
        composable("ingredients") {
            IngredientsScreen(
                viewModel = viewModel,
                modifier = modifier
            )
        }
    }
}