package com.github.ariefannur.whatsapp.redesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.compose.foundation.Box
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.github.ariefannur.whatsapp.redesign.component.Avatar
import com.github.ariefannur.whatsapp.redesign.component.AvatarSize
import com.github.ariefannur.whatsapp.redesign.component.MenuItem
import com.github.ariefannur.whatsapp.redesign.component.UserItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Content() }
    }
}

@Preview
@Composable
fun Content() {
        Surface(color = colorResource(id = R.color.colorPrimary)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.padding(end = 4.dp, start = 4.dp, top = 20.dp, bottom = 20.dp)) {
                    UserItem()
                    Box(modifier = Modifier.padding(top = 100.dp))
                    MenuItem("Home", R.drawable.ic_home, true) {
                        Log.d("AF", "click Home ")
                    }
                    MenuItem("Account", R.drawable.ic_users) {
                        Log.d("AF", "click Home ")
                    }
                    MenuItem("Chat", R.drawable.ic_message_square) {

                    }
                    MenuItem("Notification", R.drawable.ic_bell) {

                    }
                }

                Stack(modifier = Modifier.fillMaxSize()) {
                    Box(modifier = Modifier.gravity(Alignment.BottomStart), paddingBottom = 16.dp) {
                        Row() {
                            MenuItem("Setting", R.drawable.ic_settings) {

                            }
                            MenuItem("WhatsApp Web", R.drawable.ic_monitor) {

                            }
                        }
                    }
                }
            }
        }

}