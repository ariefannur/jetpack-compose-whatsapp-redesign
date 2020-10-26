package com.github.ariefannur.whatsapp.redesign.component

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.ariefannur.whatsapp.redesign.R

@Composable
fun UserItem() {

        Box(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
            Row {
                Avatar(AvatarSize.SMALL, R.drawable.ava_2)
                Column() {
                    Text(
                        text = "Jhon Doe",
                        modifier = Modifier.padding(start = 16.dp),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Text(
                        text = "Description",
                        modifier = Modifier.padding(start = 16.dp),
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
            }
        }
}