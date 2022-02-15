package com.ahmedyehya92.food2forkkmm.android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.ahmedyehya92.food2forkkmm.android.recip_details.RecipeDetailsScreen
import com.ahmedyehya92.food2forkkmm.android.recip_details.RecipeDetailsViewModel
import com.ahmedyehya92.food2forkkmm.android.recip_list.RecipeListScreen
import com.ahmedyehya92.food2forkkmm.android.recip_list.RecipeListViewModel

@Preview
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route) {
        composable(route = Screen.RecipeList.route) { navBackStackEntry ->
            val factory = HiltViewModelFactory(LocalContext.current, navBackStackEntry)
            val viewModel: RecipeListViewModel = viewModel("RecipeListViewModel", factory)
            RecipeListScreen(
                onSelectedRecipe = {recipeId ->
                    navController.navigate(Screen.RecipeDetails.route + "/$recipeId")
                }
            )
        }

        composable(
            route = Screen.RecipeDetails.route + "/{recipeId}",
            arguments = listOf(navArgument("recipeId"){
                type = NavType.IntType
            }
            )
        ) { navBackStackEntry ->
            val factory = HiltViewModelFactory(LocalContext.current, navBackStackEntry)
            val viewModel: RecipeDetailsViewModel = viewModel("RecipeDetailsViewModel", factory)
            RecipeDetailsScreen(
                recipeId = viewModel.recipeId.value,
            )
            //RecipeDetailsScreen(recipeId = navBackStackEntry.arguments?.getInt("recipeId"))
        }
    }
}