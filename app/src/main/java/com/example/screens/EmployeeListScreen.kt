package com.example.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.model.Employee


@Composable
fun EmployeeListScreen(data : Array<Employee>,onClick:()-> Unit){
    Column() {
        Text(
            text = "Employee App",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp,24.dp)
                .fillMaxSize(1f),
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = FontFamily.Monospace
        )
        employeeList(data = data){
            onClick
        }
    }
}