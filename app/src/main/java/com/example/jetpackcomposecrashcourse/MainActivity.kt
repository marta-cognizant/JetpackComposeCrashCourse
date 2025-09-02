@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposecrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.jetpackcomposecrashcourse.ui.theme.ProfileCardLayoutThema
import com.example.jetpackcomposecrashcourse.ui.theme.lightGreen
import com.example.jetpackcomposecrashcourse.ui.theme.shape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardLayoutThema {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(userProfiles: List<UserProfile> = userProfileList) {
    Scaffold(
        topBar = { AppBar() },
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            LazyColumn {
                items(userProfiles) { userProfile ->
                    ProfileCard(userProfile = userProfile)
                }
            }
//            LazyColumn {
//                userProfiles.forEach { userProfile ->
//                    item {
//                        ProfileCard(userProfile = userProfile)
//                    }
//                }
//            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun AppBar() {
    TopAppBar(
        title = {
            Text("Messaging Application Users", maxLines = 1, overflow = TextOverflow.Ellipsis)
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home button",
                modifier = Modifier.padding(horizontal = 12.dp),
            )
        },
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
    )
}

@Composable
fun ProfileCard(userProfile: UserProfile) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 4.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = shape.medium
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(userProfile.pictureUrl, userProfile.status)
            ProfileContent(userProfile.name, userProfile.status)
        }

    }
}

@Composable
fun ProfilePicture(pictureUrl: String, onlineStatus: Boolean) {
    val statusColor = if (onlineStatus) {
        MaterialTheme.colorScheme.lightGreen
    } else {
        Color.Red
    }
    Card(
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = statusColor),
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        AsyncImage(
            model = pictureUrl,
            contentDescription = "Profile picture",
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop
        )
//        Image(
//            //bitmap = ImageBitmap.imageResource(id = drawableId),
//            painter = painterResource(id = drawableId),
//            contentDescription = "Profile picture",
//            modifier = Modifier.size(72.dp),
//            contentScale = ContentScale.Crop
//        )
    }
}

@Composable
fun ProfileContent(userNames: String, onlineStatus: Boolean) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        CompositionLocalProvider(
            LocalContentColor provides (if (onlineStatus) MaterialTheme.colorScheme.onSurface.copy(
                alpha = 1f
            ) else MaterialTheme.colorScheme.onSurface.copy(
                alpha = 0.38f
            ))
        ) {
            Text(userNames, style = MaterialTheme.typography.headlineSmall)
        }
        CompositionLocalProvider(LocalContentColor provides MaterialTheme.colorScheme.onSurfaceVariant) {
            Text(
                text = if (onlineStatus) "Active now" else "Offline",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}