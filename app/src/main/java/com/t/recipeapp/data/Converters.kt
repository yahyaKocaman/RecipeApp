package com.t.recipeapp.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    @TypeConverter
    fun fromIngredientList(value: List<Ingredient>): String {
        val gson = Gson()
        val type = object : TypeToken<List<Ingredient>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toIngredientList(value: String): List<Ingredient> {
        val gson = Gson()
        val type = object : TypeToken<List<Ingredient>>() {}.type
        return gson.fromJson(value, type)
    }
}
