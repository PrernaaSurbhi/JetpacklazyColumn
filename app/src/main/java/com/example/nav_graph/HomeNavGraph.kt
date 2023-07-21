package com.example.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.DETAILED_ARG_KEY
import com.example.DETAILED_ARG_KEY2
import com.example.nested_nav_screens.DetailedScreen
import com.example.nested_nav_screens.HomeScreen
import com.example.Screens

fun NavGraphBuilder.homeNavGraph(navController: NavController){
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
////
//                navArgument(DETAILED_ARG_KEY2) {
//                    type = NavType.StringType
//                }

            //Todo  this method is used for passing Optional parameter to the String
            //In optional parameter of argument , passing defalult value is mendatory

            navArgument(DETAILED_ARG_KEY) {
                type = NavType.IntType
                defaultValue = 0
            },

            navArgument(DETAILED_ARG_KEY2) {
                type = NavType.StringType

            }
        )
    )
    {
//            Log.d("argsDetailSc", it.arguments?.getInt(DETAILED_ARG_KEY).toString())
//            Log.d("argsDetailSc", it.arguments?.getString(DETAILED_ARG_KEY2).toString())
        DetailedScreen(navController)
    }

}