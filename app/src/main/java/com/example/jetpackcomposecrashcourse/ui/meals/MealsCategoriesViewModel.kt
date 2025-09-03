package com.example.jetpackcomposecrashcourse.ui.meals

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import coil3.compose.AsyncImage
import com.example.jetpackcomposecrashcourse.model.MealsRepository
import com.example.jetpackcomposecrashcourse.model.response.MealResponse
import com.example.jetpackcomposecrashcourse.ui.theme.MyApplicationTheme

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) :
    ViewModel() {
    suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        MealsCategoriesScreen()
    }
}