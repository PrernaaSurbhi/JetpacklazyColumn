package com.example

const val DETAILED_ARG_KEY = "id"

sealed class Screens(val route :String){
    object Home : Screens(route = "home_screen")
    object Detail:Screens(route = "detail_screen/{$DETAILED_ARG_KEY}")
}
