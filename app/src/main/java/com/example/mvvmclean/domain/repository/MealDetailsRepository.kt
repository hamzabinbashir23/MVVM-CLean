package com.example.mvvmclean.domain.repository

import com.example.mvvmclean.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String): MealsDTO

}