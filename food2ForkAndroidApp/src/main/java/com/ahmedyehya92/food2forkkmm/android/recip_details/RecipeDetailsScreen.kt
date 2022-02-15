package com.ahmedyehya92.food2forkkmm.android.recip_details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RecipeDetailsScreen(
    recipeId: Int?,
    lazyName: String?,
)
{
    if(recipeId == null){
        Text(text = "ERROR")
    } else {
        Text(text = "RecipeDetailsScreen: $lazyName $recipeId")
    }
}