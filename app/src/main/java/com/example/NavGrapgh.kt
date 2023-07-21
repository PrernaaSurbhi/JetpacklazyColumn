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
    navController: NavHostController)
{
      NavHost(
          navController = navController,
          startDestination = Screens.Home.route
      ){
          composable(
              route = Screens.Home.route
          ){
              HomeScreen(navController)
          }

          composable(
              route = Screens.Detail.route,
              arguments = listOf(
                  navArgument("id") {
                      type = NavType.IntType
                  }
              )
          ){
              Log.d("argsDetailScreen receive",it.arguments?.getInt("id").toString())
             DetailedScreen(navController)
          }
      }
}