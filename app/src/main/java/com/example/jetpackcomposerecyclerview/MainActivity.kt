package com.example.jetpackcomposerecyclerview

import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
//           App()

//            val painter = painterResource(id = R.drawable.snow_man)
//            val description = "snow man is playing"
//            val title = "snow man is playing"
//
//            Box(modifier = Modifier
//                .fillMaxWidth(0.5f)
//                .padding(16.dp)
//            ) {
//                ImageCard(painter,description,title, modifier = Modifier.fillMaxWidth())
//            }

//            ListByColumn()

         //   ListByLazyColumn()

            ListByLazyColumItemsIndexed()

        }
    }
}
@Preview
@Composable
private fun ListByLazyColumItemsIndexed(){
    // lazy column is scrollable by default
    LazyColumn {
        itemsIndexed(
            listOf("This","is","RecyclerView","of","any","item","type")
        ){ index,string ->
            Text(text = " $string",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
}

@Composable
private fun ListByColumn(){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        for(i in 1..50)
            Text(text = "Item $i",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
    }
}

@Composable
private fun ListByLazyColumn(){
    // lazy column is scrollable by default
    LazyColumn {
         items(5000){
             Text(text = "Item $it",
                 fontSize = 25.sp,
                 fontWeight = FontWeight.Bold,
                 textAlign = TextAlign.Center,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(vertical = 24.dp)
             )
         }

    }
}

@Composable
private fun ImageCard(
    painter: Painter,
    contentDescription:String,
    title:String,
    modifier: Modifier){
      Card(
          modifier  = Modifier.fillMaxWidth(),
          shape = RoundedCornerShape(15.dp),

      ) {
           Box(modifier = Modifier.height(200.dp)) {
               Image(painter = painter,
                   contentDescription = contentDescription,
               contentScale = ContentScale.Crop)
           }
           Box(
               modifier = Modifier
                   .fillMaxSize()
                   .padding(12.dp),
               contentAlignment = Alignment.BottomStart
           ) {
               Text(title,style= TextStyle(color = Color.White, fontSize = 16.sp))
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

