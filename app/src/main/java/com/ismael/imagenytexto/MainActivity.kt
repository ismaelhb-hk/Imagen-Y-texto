package com.ismael.imagenytexto

import android.media.Image
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ismael.imagenytexto.ui.theme.ImagenYtextoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun AppImagenTexto() {
    Box(modifier = Modifier.fillMaxSize().padding(all = 20.dp)){
        Image(
            painter = painterResource(id = R.drawable.moto),
            contentDescription = "Imagen de un Perro bien duro",
            modifier = Modifier.align(Alignment.Center).fillMaxSize()


        )
        Text("Texto encima" ,
            modifier = Modifier.align(Alignment.Center ).background(color =  Color.Red),
            color = Color.Blue ,
            fontSize = 40.sp

        )
    }
}


@Preview
@Composable
fun Preview() {
    AppImagenTexto()

}