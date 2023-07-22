package com.example.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottom_navigation.bottom_nav_screens.HomeScreen
import com.example.bottom_navigation.bottom_nav_screens.ProfileScreen
import com.example.bottom_navigation.bottom_nav_screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
   NavHost(navController = navController,
       startDestination = Bottom_bar_screens.Home.route){

       composable(route = Bottom_bar_screens.Home.route){
           HomeScreen()
       }

       composable(route = Bottom_bar_screens.Profile.route){
           ProfileScreen()
       }

       composable(route = Bottom_bar_screens.Settings.route){
           SettingScreen()
       }
   }


}