package com.example.jetpackcomposecrashcourse.ui.details

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.jetpackcomposecrashcourse.model.MealsRepository
import com.example.jetpackcomposecrashcourse.model.response.MealResponse

class MealDetailsViewModel(
    private val saveStateHandle: SavedStateHandle,
) : ViewModel() {
    private val repository: MealsRepository = MealsRepository.getInstance()
    var mealState = mutableStateOf<MealResponse?>(null)

    init {
        val mealId = saveStateHandle.get<String>("meal_category_id") ?: ""
        Log.d("MEAL_ID", mealId)
        mealState.value = repository.getMeal(mealId)
    }
}