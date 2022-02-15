package com.ahmedyehya92.food2forkkmm.android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.ahmedyehya92.food2forkkmm.android.recip_details.RecipeDetailsScreen
import com.ahmedyehya92.food2forkkmm.android.recip_list.RecipeListScreen

@Preview
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route) {
        composable(route = Screen.RecipeList.route) { navBackStackEntry ->
            RecipeListScreen(
                onSelectedRecipe = {recipeId ->
                    navController.navigate(Screen.RecipeDetails.route + "/$recipeId" + "/Ahmed")
                }
            )
        }

        composable(
            route = Screen.RecipeDetails.route + "/{recipeId}" + "/{lazyName}",
            arguments = listOf(navArgument("recipeId"){
                type = NavType.IntType
            }
                , navArgument("lazyName") {
                    type = NavType.StringType
                }
            )
        ) { navBackStackEntry ->
            RecipeDetailsScreen(recipeId = navBackStackEntry.arguments?.getInt("recipeId"), lazyName = navBackStackEntry.arguments?.getString("lazyName"))
        }
    }
}