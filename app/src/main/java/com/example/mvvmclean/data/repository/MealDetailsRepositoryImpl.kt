package com.example.mvvmclean.data.repository

import com.example.mvvmclean.data.model.MealsDTO
import com.example.mvvmclean.data.remote.MealSearchAPI
import com.example.mvvmclean.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}