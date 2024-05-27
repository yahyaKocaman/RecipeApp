package com.t.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.t.recipeapp.data.RecipeDatabase
import com.t.recipeapp.theme.RecipeAppTheme
import com.t.recipeapp.ui.Navigation
import com.t.recipeapp.ui.RecipeViewModel
import com.t.recipeapp.ui.RecipeViewModelFactory

@Composable
fun TransparentAppBar(
    navController: NavController,
    currentRoute: NavBackStackEntry?
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(16.dp)
    ) {
        if (currentRoute?.destination?.route != "recipe_list") {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black
                )
            }
        }
        Text(
            text = "Recipe App",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
            ),
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = RecipeDatabase.getDatabase(this)
        val viewModelFactory = RecipeViewModelFactory(db.recipeDao(), this)
        val viewModel = ViewModelProvider(this, viewModelFactory)[RecipeViewModel::class.java]

        setContent {
            RecipeAppTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                        val currentRoute by navController.currentBackStackEntryAsState()
                        TransparentAppBar(navController, currentRoute)
                    },
                    content = { padding ->
                        Navigation(
                            navController = navController,
                            modifier = Modifier.padding(padding),
                            viewModel = viewModel
                        )
                    }
                )
            }
        }
    }
}
