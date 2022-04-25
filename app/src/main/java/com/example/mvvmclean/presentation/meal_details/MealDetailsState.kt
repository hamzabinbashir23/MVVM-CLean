package com.example.mvvmclean.presentation.meal_details

import com.example.mvvmclean.domain.model.MealDetails


data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}