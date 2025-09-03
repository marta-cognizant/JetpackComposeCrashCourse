package com.example.jetpackcomposecrashcourse.model

import com.example.jetpackcomposecrashcourse.model.response.MealsCategoriesResponse

class MealsRepository {
    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())
}