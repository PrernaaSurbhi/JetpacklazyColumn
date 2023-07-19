package com.example

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview
@Composable
fun DetailedScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(modifier = Modifier.clickable {
            //below both lines can be used to pop back stack
//          navController.navigate(route = Screens.Home.route)
            navController.popBackStack()
        },
            text = "Detailed  Screen" ,
            color = Color.Red,
            fontSize =  24.sp,
            fontWeight = FontWeight.Bold
        )

    }
}
