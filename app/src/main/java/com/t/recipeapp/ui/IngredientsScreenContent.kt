package com.t.recipeapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.t.recipeapp.data.Ingredient


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IngredientsScreenContent(
    userIngredients: List<Ingredient>,
    onAddIngredient: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val ingredientName = remember { mutableStateListOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Enter your ingredients:")
        userIngredients.forEach { ingredient ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White.copy(alpha = 0.5f, red = 0.5f)),
                contentAlignment = Alignment.Center
            ){
            Text(text = "${ingredient.quantity} ${ingredient.unit} ${ingredient.name}",
                )
        }}
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = ingredientName.firstOrNull() ?: "",
            onValueChange = { newValue ->
                ingredientName[0] = newValue
            },
            label = { Text("Ingredient Name") }
        )
        Button(
            onClick = {
                ingredientName.firstOrNull()?.let { name ->
                    onAddIngredient(name)
                    ingredientName[0] = ""
                }
            }
        ) {
            Text(text = "Add Ingredient")
        }
    }
}

