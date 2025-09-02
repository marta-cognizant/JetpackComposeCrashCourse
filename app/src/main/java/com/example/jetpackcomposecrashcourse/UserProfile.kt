package com.example.jetpackcomposecrashcourse

import android.graphics.drawable.Drawable

data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile("John Doe", true, R.drawable.profile_picture_1),
    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
    UserProfile("Rex Alex", true, R.drawable.profile_picture_3)
)