package com.example.jetpackcomposecrashcourse.model.response

import kotlinx.serialization.SerialName

data class MealsCategoriesResponse(val categories: List<MealResponse>)

data class MealResponse(
    @SerialName("idCategory") val id: String,
    @SerialName("strCategory") val name: String,
    @SerialName("strCategoryThumb") val description: String,
    @SerialName("strCategoryDescription") val imageUrl: String
)
