package com.example

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Bottom_bar_screens(val route:String,
                                 val title:String,
                                 val icon:ImageVector){

    object Home:Bottom_bar_screens(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : Bottom_bar_screens(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Settings : Bottom_bar_screens(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}
