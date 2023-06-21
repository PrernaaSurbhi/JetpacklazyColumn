package com.example

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.model.Employee
import com.google.gson.Gson
import java.io.InputStream


object DataManger {

    var data = emptyArray<Employee>()

    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context){
        val inputStream:InputStream = context.assets.open("employee.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()

        data = gson.fromJson(json,Array<Employee>::class.java)

        isDataLoaded.value = true
    }
}