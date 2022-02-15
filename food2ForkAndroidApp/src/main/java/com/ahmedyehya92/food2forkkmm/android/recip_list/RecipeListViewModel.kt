package com.ahmedyehya92.food2forkkmm.android.recip_list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel
@Inject
constructor(
    private val savedStateHandle: SavedStateHandle // dont need for this VM
): ViewModel()
{

}