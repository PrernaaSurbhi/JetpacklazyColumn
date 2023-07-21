package com.example

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun setUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(
            route = Screens.Home.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screens.Detail.route,
            arguments = listOf(
                //Todo  these method is used for passing Mendatory parameter to the String
//                navArgument(DETAILED_ARG_KEY) {
//                    type = NavType.IntType
//                },
//
//                navArgument(DETAILED_ARG_KEY2) {
//                    type = NavType.StringType
//                }

                //Todo  this method is used for passing Optional parameter to the String
                //In optional parameter of argument , passing defalult value is mendatory

                navArgument(DETAILED_ARG_KEY){
                    type = NavType.IntType
                    defaultValue = 0
//                    nullable = true
                }
            )
        ) {
            Log.d("argsDetailSc", it.arguments?.getInt(DETAILED_ARG_KEY).toString())
            Log.d("argsDetailSc", it.arguments?.getString(DETAILED_ARG_KEY2).toString())
            DetailedScreen(navController)
        }
    }
}