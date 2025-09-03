package com.example.jetpackcomposecrashcourse.ui.meals

import androidx.lifecycle.ViewModel
import com.example.jetpackcomposecrashcourse.model.MealsRepository
import com.example.jetpackcomposecrashcourse.model.response.MealResponse
import com.example.jetpackcomposecrashcourse.model.response.MealsCategoriesResponse

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        return repository.getMeals { response ->
            successCallback(response)
        }
    }
}