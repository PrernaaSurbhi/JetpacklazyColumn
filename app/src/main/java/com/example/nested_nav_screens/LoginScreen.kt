package com.example.nested_nav_screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.Screens


@Composable
fun LoginScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Login",
            modifier = Modifier.clickable {
            navController.navigate(route = Screens.SignUp.route)
        },
            color = Color.Magenta,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Open Detail Screen",
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.popBackStack()
                    navController.navigate(Screens.Detail.passNameAndId())
                },
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Cyan
        )
    }

}

@Preview
@Composable
fun loginScreenPreview(){
    LoginScreen(navController = rememberNavController())
}
