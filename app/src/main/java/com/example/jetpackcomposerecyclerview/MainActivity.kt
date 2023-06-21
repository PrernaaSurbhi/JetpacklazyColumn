package com.example.jetpackcomposerecyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.DataManger
import com.example.screens.EmployeeListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            DataManger.loadAssetsFromFile(applicationContext)
        }

        setContent {
           App()
        }
    }
}

@Composable
fun App(){
    if (DataManger.isDataLoaded.value){
        EmployeeListScreen(data = DataManger.data) {
            
        }
    }else{
        Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)) {
            Text(text ="Loading.....",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

