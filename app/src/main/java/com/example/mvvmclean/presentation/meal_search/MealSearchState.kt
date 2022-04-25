package com.example.mvvmclean.presentation.meal_search

import com.example.mvvmclean.domain.model.Meal


data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)