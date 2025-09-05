package com.example.jetpackcomposecrashcourse.ui.details

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.SegmentedButtonDefaults.borderStroke
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.transformations
import coil3.size.Size
import coil3.transform.CircleCropTransformation
import com.example.jetpackcomposecrashcourse.model.response.MealResponse

@Composable
fun MealDetailsScreen(meal: MealResponse?) {
    var profilePictureState by remember { mutableStateOf(ProfilePictureState.Normal) }
    val transition = updateTransition(targetState = profilePictureState)
    val imageSizeDp: Dp by transition.animateDp(
        targetValueByState = { it.size }, label = "Image size"
    )
    val color by transition.animateColor(targetValueByState = { it.color }, label = "Color")
    val widthSize by transition.animateDp(
        targetValueByState = { it.borderWidth }, label = "Border width"
    )

    Column {
        Row {
            Card(
                modifier = Modifier.padding(16.dp),
                shape = CircleShape,
                border = borderStroke(
                    width = widthSize,
                    color = color
                )
            ) {
                Image(
                    painter = rememberAsyncImagePainter(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(meal?.imageUrl)
                            .size(Size.ORIGINAL)
                            .transformations(CircleCropTransformation())
                            .build(),
                    ),
                    contentDescription = "Meal Image",
                    modifier = Modifier
                        .size(imageSizeDp)
                        .padding(8.dp)
                )
            }
            Text(
                text = meal?.name ?: "default name",
                modifier = Modifier
                    .padding(16.dp)
                    .align(
                        Alignment.CenterVertically
                    )
            )
        }
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = {
                profilePictureState =
                    if (profilePictureState == ProfilePictureState.Normal)
                        ProfilePictureState.Expanded
                    else ProfilePictureState.Normal
            }) {
            Text(text = "Change state of meal profile picture")
        }
    }
}

enum class ProfilePictureState(val color: Color, val size: Dp, val borderWidth: Dp) {
    Normal(Color.Green, 120.dp, 8.dp),
    Expanded(Color.Cyan, 200.dp, 24.dp)
}
