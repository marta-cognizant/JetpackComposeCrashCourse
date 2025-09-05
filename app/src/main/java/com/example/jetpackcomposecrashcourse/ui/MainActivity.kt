package com.example.jetpackcomposecrashcourse.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposecrashcourse.ui.details.MealDetailsScreen
import com.example.jetpackcomposecrashcourse.ui.details.MealDetailsViewModel
import com.example.jetpackcomposecrashcourse.ui.meals.MealsCategoriesScreen
import com.example.jetpackcomposecrashcourse.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Surface {
                MyApplicationTheme {
                    Log.d("MainActivity", "Activity content")
                    FoodiesApp()
                }
            //}
        }
    }
}

@Composable
private fun FoodiesApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "destination_meals_list") {
        composable(route = "destination_meals_list") {
            MealsCategoriesScreen { navigationMealId ->
                navController.navigate(route = "destination_meal_details/$navigationMealId")
            }
        }
        composable(
            route = "destination_meal_details/{meal_category_id}",
            arguments = listOf(
                navArgument("meal_category_id") {
                    type = NavType.StringType
                })
        ) {
            val viewModel: MealDetailsViewModel = viewModel()
            MealDetailsScreen(viewModel.mealState.value)
        }
    }
}