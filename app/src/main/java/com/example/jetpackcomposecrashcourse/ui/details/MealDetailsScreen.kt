package com.example.jetpackcomposecrashcourse.ui.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.transformations
import coil3.size.Size
import coil3.transform.CircleCropTransformation

import com.example.jetpackcomposecrashcourse.model.response.MealResponse

@Composable
fun MealDetailsScreen(meal: MealResponse?) {
    Column {
        Row {
            Card() {
                Image(
                    painter = rememberAsyncImagePainter(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(meal?.imageUrl)
                            .size(Size.ORIGINAL)
                            .transformations(CircleCropTransformation())
                            .build(),
                    ),
                    contentDescription = "Meal Image",
                    modifier = Modifier.size(200.dp)
                )
            }
            Text(text = meal?.name ?: "default name")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Change state of meal profile picture")
        }
    }
}
