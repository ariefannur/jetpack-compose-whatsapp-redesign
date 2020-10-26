package com.github.ariefannur.whatsapp.redesign.component

import android.view.GestureDetector
import androidx.compose.foundation.Box
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.gesture.rawPressStartGestureFilter
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.github.ariefannur.whatsapp.redesign.R

@Composable
fun MenuItem(text: String, icon: Int, selected: Boolean = false, onClick : (Offset) -> Unit) {
    Box(modifier = Modifier.rawPressStartGestureFilter(onPressStart = onClick)) {
        Row(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)) {
            val asset = vectorResource(id = icon)
            val color = if (selected) Color.White else Color(0xffc4c4c4)
            Icon(asset = asset, modifier = Modifier.preferredSize(18.dp), color)
            Text(text = text, modifier = Modifier.padding(start = 16.dp), color = color)
        }
    }
}

