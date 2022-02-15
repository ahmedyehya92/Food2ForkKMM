package com.ahmedyehya92.food2forkkmm.android.navigation

sealed class Screen(val route: String) {
    object RecipeList: Screen("recipeList")
    object RecipeDetails: Screen("recipeDetails")
}