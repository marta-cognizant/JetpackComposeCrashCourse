package com.example.jetpackcomposecrashcourse.ui.meals

import androidx.lifecycle.ViewModel
import com.example.jetpackcomposecrashcourse.model.MealsRepository
import com.example.jetpackcomposecrashcourse.model.response.MealResponse

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}