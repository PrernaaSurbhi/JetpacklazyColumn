package com.example.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.AUTH_GRAPH_ROUTE
import com.example.nested_nav_screens.LoginScreen
import com.example.Screens
import com.example.nested_nav_screens.SignUpScreen


fun NavGraphBuilder.authNavGraph(navController: NavController)
 {
    navigation(
        startDestination = Screens.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(route = Screens.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screens.SignUp.route) {
            SignUpScreen(navigationController = navController)
        }
    }
}
