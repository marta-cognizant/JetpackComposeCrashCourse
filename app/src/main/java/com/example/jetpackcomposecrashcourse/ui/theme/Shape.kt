package com.example.jetpackcomposecrashcourse.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val shape = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = CutCornerShape(topEnd = 24.dp),
    large = RoundedCornerShape(8.dp)
)