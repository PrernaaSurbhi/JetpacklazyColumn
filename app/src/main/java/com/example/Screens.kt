package com.example


sealed class Screens(val route :String){
    object Home : Screens(route = "home_screen")
    object Detail:Screens(route = "detail_screen/{id}")
}
