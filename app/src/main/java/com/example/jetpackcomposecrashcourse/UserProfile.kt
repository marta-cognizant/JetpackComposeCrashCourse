package com.example.jetpackcomposecrashcourse

import android.graphics.drawable.Drawable

// data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)
data class UserProfile(val id: Int, val name: String, val status: Boolean, val pictureUrl: String)

val userProfileList = arrayListOf<UserProfile>(
    UserProfile(
        id = 0,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 1,
        "Jane Smith",
        false,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 2,
        "Rex Alex",
        false,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 3,
        "John Doe",
        false,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 4,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 5,
        "Rex Alex",
        false,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 6,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 7,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 8,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 9,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 10,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 11,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 12,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 13,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 14,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 15,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 16,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 17,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 18,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 19,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 20,
        "Rex Alex",
        false,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 21,
        "John Doe",
        false,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 22,
        "Jane Smith",
        true,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 23,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
    UserProfile(
        id = 24,
        "John Doe",
        true,
        "https://cdn.pixabay.com/photo/2024/07/22/17/11/elegance-in-profile-8913207_1280.png"
    ),
    UserProfile(
        id = 25,
        "Jane Smith",
        false,
        "https://cdn.pixabay.com/photo/2016/06/21/23/05/girl-1472185_1280.jpg"
    ),
    UserProfile(
        id = 26,
        "Rex Alex",
        true,
        "https://cdn.pixabay.com/photo/2016/11/19/15/20/dog-1839808_1280.jpg"
    ),
)


//val userProfileList = arrayListOf<UserProfile>(
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", false, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", true, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", false, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", true, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//    UserProfile("John Doe", true, R.drawable.profile_picture_1),
//    UserProfile("Jane Smith", false, R.drawable.profile_picture_2),
//    UserProfile("Rex Alex", true, R.drawable.profile_picture_3),
//)