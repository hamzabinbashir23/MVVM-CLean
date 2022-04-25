package com.example.mvvmclean.data.repository

import com.example.mvvmclean.data.model.MealsDTO
import com.example.mvvmclean.data.remote.MealSearchAPI
import com.example.mvvmclean.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}