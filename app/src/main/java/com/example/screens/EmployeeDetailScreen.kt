package com.example.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.model.Employee

@Composable
fun employeeList(data:Array<Employee>,onClick: ()-> Unit){

    LazyColumn(content = {
        items(data){
            EmployeeListItems(employee = it) {
                onClick()
            }
        }
    }
    )
}