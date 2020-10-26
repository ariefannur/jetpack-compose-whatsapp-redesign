package com.github.ariefannur.whatsapp.redesign.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp


enum class AvatarSize {
    SMALL,
    MEDIUM
}

@Composable
fun Avatar(avatarSize: AvatarSize, drawable: Int) {
    val width = when(avatarSize) {
        AvatarSize.SMALL -> 36.dp
        else -> 48.dp
    }
    val rounded = width / 2
    val image = imageResource(id = drawable)
    val modifier = Modifier.preferredHeight(width).clip(shape = RoundedCornerShape(rounded))
    Image(image, modifier = modifier)
}