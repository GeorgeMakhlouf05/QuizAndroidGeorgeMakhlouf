package com.example.quizandroidgeorgemakhlouf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizandroidgeorgemakhlouf.ui.theme.QuizAndroidGeorgeMakhloufTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pantalla1()
            Pantalla2()


            }
        }
    }
@Preview(showBackground = true)
@Composable
fun Pantalla1() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Encabezado",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,



        )




        Spacer(modifier = Modifier.height(400.dp))

        Text(
            text = "Item1             Item2              Item3",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(350.dp))

        Text(
            text = "Pie de página",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold

        )

    }
}
@OptIn(ExperimentalLayoutApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Pantalla2() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "George Sebastian Makhlouf Ruiz",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Android developer passionate about technology and design",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem("150", "Posts")
            StatItem("2.3K", "Seguidores")
            StatItem("980", "Likes")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(onClick = {}, modifier = Modifier.weight(1f)) {
                Text("Seguir")
            }
            OutlinedButton(onClick = {}, modifier = Modifier.weight(1f)) {
                Text("Mensaje")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text("Intereses", fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            listOf("Ciclismo", "Programación", "UI/UX", "Música", "Viajes", "Gaming")
                .forEach {
                    AssistChip(
                        onClick = {},
                        label = { Text(it) }
                    )
                }
        }
    }
}

@Composable
fun StatItem(x0: String, x1: String) {
    TODO("Not yet implemented")
}









