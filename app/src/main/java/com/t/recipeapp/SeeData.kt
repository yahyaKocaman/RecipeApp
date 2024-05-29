
package com.t.recipeapp

import com.t.recipeapp.data.Ingredient
import com.t.recipeapp.data.Recipe
import com.t.recipeapp.data.RecipeType

val carbRecipes = listOf(
    Recipe(
        id = 1,
        name = "Spaghetti Bolognese",
        imageResourceId = R.drawable.spaghetti,
        ingredients = listOf(
            Ingredient("ground beef", 1.0, "lb"),
            Ingredient("tomato sauce", 24.0, "oz"),
            Ingredient("spaghetti", 16.0, "oz")
        ),
        instructions = "1. Cook the ground beef...",
        calories = 650,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 2,
        name = "bulgur rice",
        imageResourceId = R.drawable.bulgur_pilav,
        ingredients = listOf(
            Ingredient("ground beef", 1.0, "lb"),
            Ingredient("tomato sauce", 24.0, "oz"),
            Ingredient("spaghetti", 16.0, "oz")
        ),
        instructions = "1. Cook the ground beef...",
        calories = 650,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 3,
        name = "Rice",
        imageResourceId = R.drawable.pilav,
        ingredients = listOf(
            Ingredient("ground beef", 1.0, "lb"),
            Ingredient("tomato sauce", 24.0, "oz"),
            Ingredient("spaghetti", 16.0, "oz")
        ),
        instructions = "1. Cook the ground beef...",
        calories = 650,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 4,
        name = "lantle",
        imageResourceId = R.drawable.mercimek,
        ingredients = listOf(
            Ingredient("ground beef", 1.0, "lb"),
            Ingredient("tomato sauce", 24.0, "oz"),
            Ingredient("spaghetti", 16.0, "oz")
        ),
        instructions = "1. Cook the ground beef...",
        calories = 650,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 5,
        name = "chickpeas",
        imageResourceId = R.drawable.nohut,
        ingredients = listOf(
            Ingredient("ground beef", 1.0, "lb"),
            Ingredient("tomato sauce", 24.0, "oz"),
            Ingredient("spaghetti", 16.0, "oz")
        ),
        instructions = "1. Cook the ground beef...",
        calories = 650,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 6,
        name = "Pasta Carbonara",
        imageResourceId = R.drawable.pasta_carbonara,
        ingredients = listOf(
            Ingredient("spaghetti", 8.0, "oz"),
            Ingredient("bacon", 6.0, "slices"),
            Ingredient("eggs", 3.0, "whole"),
            Ingredient("parmesan cheese", 1.0, "cup"),
            Ingredient("garlic", 2.0, "cloves")
        ),
        instructions = "1. Cook the spaghetti according to package instructions...",
        calories = 800,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 7,
        name = "Baked Potato",
        imageResourceId = R.drawable.baked_potato,
        ingredients = listOf(
            Ingredient("russet potatoes", 4.0, "whole"),
            Ingredient("butter", 4.0, "tbsp"),
            Ingredient("sour cream", 0.5, "cup"),
            Ingredient("bacon bits", 0.25, "cup"),
            Ingredient("chives", 2.0, "tbsp")
        ),
        instructions = "1. Preheat oven to 400°F...",
        calories = 400,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 8,
        name = "Garlic Bread",
        imageResourceId = R.drawable.garlic_bread,
        ingredients = listOf(
            Ingredient("French bread loaf", 1.0, "whole"),
            Ingredient("butter", 0.5, "cup"),
            Ingredient("garlic", 4.0, "cloves"),
            Ingredient("parsley", 2.0, "tbsp"),
            Ingredient("parmesan cheese", 0.25, "cup")
        ),
        instructions = "1. Preheat oven to 375°F...",
        calories = 300,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 9,
        name = "Fried Rice",
        imageResourceId = R.drawable.kurufasulye,
        ingredients = listOf(
            Ingredient("cooked rice", 3.0, "cups"),
            Ingredient("eggs", 2.0, "whole"),
            Ingredient("carrots", 1.0, "whole"),
            Ingredient("green onions", 4.0, "whole"),
            Ingredient("soy sauce", 3.0, "tbsp")
        ),
        instructions = "1. Heat a large skillet or wok over high heat...",
        calories = 450,
        type = RecipeType.CARBS
    ),
    Recipe(
        id = 10,
        name = "Mashed Potatoes",
        imageResourceId = R.drawable.mashed_potato,
        ingredients = listOf(
            Ingredient("russet potatoes", 6.0, "whole"),
            Ingredient("butter", 0.5, "cup"),
            Ingredient("milk", 1.0, "cup"),
            Ingredient("salt", 1.0, "tsp"),
            Ingredient("black pepper", 0.5, "tsp")
        ),
        instructions = "1. Peel and cut the potatoes into quarters...",
        calories = 500,
        type = RecipeType.CARBS
    )
)

// Protein recipes
val proteinRecipes = listOf(
    Recipe(
        id = 11,
        name = "Grilled Salmon",
        imageResourceId = R.drawable.salmon,
        ingredients = listOf(
            Ingredient("salmon fillets", 1.0, "lb"),
            Ingredient("lemon", 1.0, "whole"),
            Ingredient("olive oil", 2.0, "tbsp"),
            Ingredient("salt", 0.5, "tsp"),
            Ingredient("black pepper", 0.25, "tsp")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 350,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 12,
        name = "Chicken Saute",
        imageResourceId = R.drawable.tavuk_sote,
        ingredients = listOf(
            Ingredient("salmon fillets", 1.0, "lb"),
            Ingredient("lemon", 1.0, "whole"),
            Ingredient("olive oil", 2.0, "tbsp"),
            Ingredient("salt", 0.5, "tsp"),
            Ingredient("black pepper", 0.25, "tsp")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 350,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 13,
        name = "Burger",
        imageResourceId = R.drawable.burger,
        ingredients = listOf( Ingredient("salmon fillets", 1.0, "lb"),
            Ingredient("lemon", 1.0, "whole"),
            Ingredient("olive oil", 2.0, "tbsp"),
            Ingredient("salt", 0.5, "tsp"),
            Ingredient("black pepper", 0.25, "tsp")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 350,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 14,
        name = "Turkey",
        imageResourceId = R.drawable.turkey,
        ingredients = listOf(
            Ingredient("salmon fillets", 1.0, "lb"),
            Ingredient("lemon", 1.0, "whole"),
            Ingredient("olive oil", 2.0, "tbsp"),
            Ingredient("salt", 0.5, "tsp"),
            Ingredient("black pepper", 0.25, "tsp")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 350,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 15,
        name = "Grilled Chicken",
        imageResourceId = R.drawable.grilled_chicken,
        ingredients = listOf(
            Ingredient("chicken breasts", 4.0, "whole"),
            Ingredient("olive oil", 2.0, "tbsp"),
            Ingredient("lemon juice", 2.0, "tbsp"),
            Ingredient("garlic", 3.0, "cloves"),
            Ingredient("Italian seasoning", 1.0, "tsp")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 250,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 16,
        name = "Beef Stir-Fry",
        imageResourceId = R.drawable.beef_stir_fry,
        ingredients = listOf(
            Ingredient("sirloin steak", 1.0, "lb"),
            Ingredient("broccoli", 1.0, "head"),
            Ingredient("carrots", 2.0, "whole"),
            Ingredient("soy sauce", 0.25, "cup"),
            Ingredient("rice vinegar", 2.0, "tbsp")
        ),
        instructions = "1. Slice the sirloin steak into thin strips...",
        calories = 400,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 17,
        name = "Grilled Shrimp Skewers",
        imageResourceId = R.drawable.shrimp_skewers,
        ingredients = listOf(
            Ingredient("shrimp", 1.0, "lb"),
            Ingredient("bell peppers", 2.0, "whole"),
            Ingredient("red onion", 1.0, "whole"),
            Ingredient("lime juice", 3.0, "tbsp"),
            Ingredient("cilantro", 0.25, "cup")
        ),
        instructions = "1. Preheat grill to medium-high heat...",
        calories = 200,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 18,
        name = "Baked Cod",
        imageResourceId = R.drawable.levrek,
        ingredients = listOf(
            Ingredient("cod fillets", 1.0, "lb"),
            Ingredient("lemon juice", 2.0, "tbsp"),
            Ingredient("breadcrumbs", 0.5, "cup"),
            Ingredient("parmesan cheese", 0.25, "cup"),
            Ingredient("parsley", 2.0, "tbsp")
        ),
        instructions = "1. Preheat oven to 400°F...",
        calories = 300,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 19,
        name = "Turkey Burgers",
        imageResourceId = R.drawable.turkey_burgers,
        ingredients = listOf(
            Ingredient("ground turkey", 1.0, "lb"),
            Ingredient("breadcrumbs", 0.5, "cup"),
            Ingredient("egg", 1.0, "whole"),
            Ingredient("onion", 0.5, "whole"),
            Ingredient("Worcestershire sauce", 1.0, "tbsp")
        ),
        instructions = "1. In a large bowl, mix together all ingredients...",
        calories = 250,
        type = RecipeType.PROTEINS
    ),
    Recipe(
        id = 20,
        name = "Lentil and Sausage Stew",
        imageResourceId = R.drawable.lentil_stew,
        ingredients = listOf(
            Ingredient("lentils", 1.0, "cup"),
            Ingredient("sausage", 1.0, "lb"),
            Ingredient("onion", 1.0, "whole"),
            Ingredient("carrots", 2.0, "whole"),
            Ingredient("chicken broth", 4.0, "cups")
        ),
        instructions = "1. In a large pot, sauté the onion and sausage...",
        calories = 450,
        type = RecipeType.PROTEINS
    )
)

// Fat recipes
val fatRecipes = listOf(
    Recipe(
        id = 21,
        name = "Greek Salad",
        imageResourceId = R.drawable.avocadosalad,
        ingredients = listOf(
            Ingredient("romaine lettuce", 1.0, "head"),
            Ingredient("tomatoes", 4.0, "whole"),
            Ingredient("cucumber", 1.0, "whole"),
            Ingredient("red onion", 0.5, "whole"),
            Ingredient("feta cheese", 4.0, "oz"),
            Ingredient("kalamata olives", 0.5, "cup"),
            Ingredient("red wine vinegar", 3.0, "tbsp"),
            Ingredient("olive oil", 3.0, "tbsp")
        ),
        instructions = "1. Chop the romaine lettuce...",
        calories = 250,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 22,
        name = "Greek Salad",
        imageResourceId = R.drawable.avocadosalad,
        ingredients = listOf(
            Ingredient("romaine lettuce", 1.0, "head"),
            Ingredient("tomatoes", 4.0, "whole"),
            Ingredient("cucumber", 1.0, "whole"),
            Ingredient("red onion", 0.5, "whole"),
            Ingredient("feta cheese", 4.0, "oz"),
            Ingredient("kalamata olives", 0.5, "cup"),
            Ingredient("red wine vinegar", 3.0, "tbsp"),
            Ingredient("olive oil", 3.0, "tbsp")
        ),
        instructions = "1. Chop the romaine lettuce...",
        calories = 250,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 23,
        name = "Frying Plate",
        imageResourceId = R.drawable.frying_plate,
        ingredients = listOf(
            Ingredient("romaine lettuce", 1.0, "head"),
            Ingredient("tomatoes", 4.0, "whole"),
            Ingredient("cucumber", 1.0, "whole"),
            Ingredient("red onion", 0.5, "whole"),
            Ingredient("feta cheese", 4.0, "oz"),
            Ingredient("kalamata olives", 0.5, "cup"),
            Ingredient("red wine vinegar", 3.0, "tbsp"),
            Ingredient("olive oil", 3.0, "tbsp")
        ),
        instructions = "1. Chop the romaine lettuce...",
        calories = 250,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 24,
        name = "Iskender Kebab",
        imageResourceId = R.drawable.iskender_kebab,
        ingredients = listOf(
            Ingredient("romaine lettuce", 1.0, "head"),
            Ingredient("tomatoes", 4.0, "whole"),
            Ingredient("cucumber", 1.0, "whole"),
            Ingredient("red onion", 0.5, "whole"),
            Ingredient("feta cheese", 4.0, "oz"),
            Ingredient("kalamata olives", 0.5, "cup"),
            Ingredient("red wine vinegar", 3.0, "tbsp"),
            Ingredient("olive oil", 3.0, "tbsp")
        ),
        instructions = "1. Chop the romaine lettuce...",
        calories = 250,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 25,
        name = "Stuffed Grape Leaves",
        imageResourceId = R.drawable.yaprak_sarma,
        ingredients = listOf(
            Ingredient("avocado", 1.0, "whole"),
            Ingredient("whole grain bread", 2.0, "slices"),
            Ingredient("lemon juice", 1.0, "tbsp"),
            Ingredient("salt", 0.25, "tsp"),
            Ingredient("red pepper flakes", 0.25, "tsp")
        ),
        instructions = "1. Toast the bread slices...",
        calories = 300,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 26,
        name = "Guacamole",
        imageResourceId = R.drawable.guacamole,
        ingredients = listOf(
            Ingredient("avocados", 3.0, "whole"),
            Ingredient("tomato", 1.0, "whole"),
            Ingredient("onion", 0.5, "whole"),
            Ingredient("lime juice", 2.0, "tbsp"),
            Ingredient("cilantro", 0.25, "cup")
        ),
        instructions = "1. Mash the avocados in a bowl...",
        calories = 350,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 27,
        name = "Kayseri Lubrication",
        imageResourceId = R.drawable.yaglama,
        ingredients = listOf(
            Ingredient("spinach", 8.0, "cups"),
            Ingredient("eggs", 2.0, "whole"),
            Ingredient("bacon", 4.0, "slices"),
            Ingredient("mushrooms", 8.0, "oz"),
            Ingredient("balsamic vinaigrette", 0.5, "cup")
        ),
        instructions = "1. Cook the eggs and bacon...",
        calories = 400,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 28,
        name = "Okra With Olive Oil",
        imageResourceId = R.drawable.bamya,
        ingredients = listOf(
            Ingredient("salmon fillets", 1.0, "lb"),
            Ingredient("walnuts", 0.5, "cup"),
            Ingredient("breadcrumbs", 0.25, "cup"),
            Ingredient("Dijon mustard", 2.0, "tbsp"),
            Ingredient("honey", 1.0, "tbsp")
        ),
        instructions = "1. Preheat oven to 400°F...",
        calories = 450,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 29,
        name = "Manti",
        imageResourceId = R.drawable.manti,
        ingredients = listOf(
            Ingredient("avocados", 2.0, "whole"),
            Ingredient("shrimp", 0.5, "lb"),
            Ingredient("tomato", 1.0, "whole"),
            Ingredient("red onion", 0.5, "whole"),
            Ingredient("lime juice", 2.0, "tbsp")
        ),
        instructions = "1. Cut the avocados in half and remove the pits...",
        calories = 400,
        type = RecipeType.FATS
    ),
    Recipe(
        id = 30,
        name = "Coconut Shrimp",
        imageResourceId = R.drawable.coconut_shrimp,
        ingredients = listOf(
            Ingredient("shrimp", 1.0, "lb"),
            Ingredient("coconut flakes", 1.0, "cup"),
            Ingredient("breadcrumbs", 0.5, "cup"),
            Ingredient("eggs", 2.0, "whole"),
            Ingredient("flour", 0.5, "cup")
        ),
        instructions = "1. Preheat oil for frying to 350°F...",
        calories = 500,
        type = RecipeType.FATS
    )
)

fun <T> List<T>.getRandomSublist(size: Int): List<T> {
    require(size <= this.size) { "Size cannot be greater than the list size" }
    return this.shuffled().take(size)
}