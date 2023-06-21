package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposerecyclerview.R
import com.example.model.Employee

//clickable modifier used below to add the on click

@Composable
fun EmployeeListItems(employee: Employee,onClick: ()-> Unit){
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .clickable { onClick() }
            .padding(16.dp)

    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painterResource(R.drawable.baseline_person_24),
                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(androidx.compose.ui.graphics.Color.White),
                alignment = Alignment.TopStart,
                contentDescription ="PersonDetail",
                modifier = Modifier
                    .size(40.dp)
                    .background(androidx.compose.ui.graphics.Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(text = employee.id,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp)
                )
                Box(modifier = Modifier
                    .background(Color(0xFFEEEEEE))
                    .fillMaxWidth(.6f)
                    .height(1.dp)
                )
//                Text(text = employee.empName,
//                style=MaterialTheme.typography.bodySmall,
//                    fontWeight = FontWeight.Thin,
//                    modifier = Modifier.padding(top = 4.dp)
//                )

            }
        }
    }

}

