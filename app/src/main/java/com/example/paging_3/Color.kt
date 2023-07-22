package com.example.paging_3

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Magenta

val Colors.topAppBarContentColor:Color
    get() = if (isLight) Color.White else Color.LightGray

val Colors.topAppBarBackgroundColor:Color
    get() = if (isLight) Magenta else Color.Black