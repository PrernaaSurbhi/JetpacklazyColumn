package com.example

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

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
              route = Screens.Detail.route
          ){
             DetailedScreen(navController)
          }
      }
}