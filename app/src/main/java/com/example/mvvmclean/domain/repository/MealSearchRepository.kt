package com.example.mvvmclean.domain.repository

import com.example.mvvmclean.data.model.MealsDTO

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO



}