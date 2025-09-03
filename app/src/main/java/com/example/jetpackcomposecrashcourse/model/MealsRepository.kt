package com.example.jetpackcomposecrashcourse.model

import com.example.jetpackcomposecrashcourse.model.api.MealsWebService
import com.example.jetpackcomposecrashcourse.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }
}