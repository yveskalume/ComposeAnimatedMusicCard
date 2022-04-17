package com.yvkalume.animatedcard

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class DataModel(
    val title: String,
    val singer: String,
    @DrawableRes
    val image: Int,
    val color: Color
)

fun getData(): List<DataModel> {
    return listOf(
        DataModel("Waka waka","Shakira", R.drawable.shakira, Color(0xFFFF8B01)),
        DataModel("Ghost","Justin Bieber", R.drawable.justin, Color(0xFFFF0000)),
        DataModel("Drunk in love","Beyoncé", R.drawable.beyonce, Color(0xFF005DFF)),
        DataModel("With you","Chris brown", R.drawable.brown, Color(0xFF00FF37))
    )
}
