package com.t.recipeapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecipeDao {
    @Query("SELECT * FROM Recipe")
    fun getAllRecipes(): LiveData<List<Recipe>>

    @Query(value = "SELECT * FROM Recipe WHERE id = :recipeId")
    fun getRecipeById(recipeId: Int): Recipe?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipe(recipe: Recipe)

    @Delete
    suspend fun deleteRecipe(recipe: Recipe)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteRecipe(favoriteRecipe: FavoriteRecipe)

    @Delete
    suspend fun deleteFavoriteRecipe(favoriteRecipe: FavoriteRecipe)

    @Query("SELECT * FROM favorite_recipes WHERE userId = :userId")
    fun getFavoriteRecipesForUser(userId: Int): LiveData<List<FavoriteRecipe>>
}
