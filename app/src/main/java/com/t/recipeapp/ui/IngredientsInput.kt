package com.t.recipeapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.t.recipeapp.data.Ingredient

// IngredientsInput.kt
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IngredientsInput(
    viewModel: RecipeViewModel,
    modifier: Modifier = Modifier
) {
    val ingredientName = remember { mutableStateListOf("") }

    Column(modifier = modifier) {
        TextField(
            value = ingredientName.firstOrNull() ?: "",
            onValueChange = { newValue ->
                ingredientName[0] = newValue
            },
            label = { Text("Enter your current ingredient"
            , modifier = Modifier.fillMaxWidth()) }
        )
        Button(modifier = Modifier.fillMaxWidth(),
            onClick = {
                ingredientName.firstOrNull()?.let { name ->
                    viewModel.addUserIngredient(Ingredient(name, 1.0, "unit"))
                    ingredientName[0] = ""
                }

            }
        ) {
            Text(text = "Add Ingredient")
        }
    }
}