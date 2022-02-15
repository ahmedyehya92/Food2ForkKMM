package com.ahmedyehya92.food2forkkmm.android.recip_details

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeDetailsViewModel
@Inject
constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel()
{
    val recipeId: MutableState<Int?> = mutableStateOf(null)
    init {
        savedStateHandle.get<Int>("recipeId")?.let { recipeId ->
            this.recipeId.value = recipeId
        }
    }
}