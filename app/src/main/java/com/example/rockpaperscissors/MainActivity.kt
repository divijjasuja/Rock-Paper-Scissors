package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rockpaperscissors.ui.theme.RockPaperScissorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    EndResult()
                }
            }
        }
    }
}

@Composable
fun HandImg() {
    val image = painterResource(id = R.drawable._109_w023_n001_998b_p1_998)
    Image(painter = image, contentDescription = null, modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(Alignment.Top))
}

@Composable
fun Score() {
    Column(modifier = Modifier
        .wrapContentWidth(Alignment.CenterHorizontally)
        .wrapContentHeight(Alignment.CenterVertically)
        .padding(bottom = 250.dp)
    ){
        Text(text = "Score",
            fontSize = 30.sp
        )
        Text(text = "0/4",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Choice(player:String,android:String) {
    Row(modifier = Modifier
        .width(16.dp)
        .wrapContentWidth(Alignment.CenterHorizontally)
        .wrapContentHeight(Alignment.CenterVertically),
        horizontalArrangement = Arrangement.spacedBy(100.dp)
    ) {
        Column() {
            Text(text = "your choice",fontSize = 16.sp)
            Text(text = "$player",fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
        Column() {
            Text(text = "Android choice", fontSize = 16.sp)
            Text(text = "$android", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ButtonBox() {
    Row(modifier = Modifier
        .width(16.dp)
        .wrapContentWidth(Alignment.CenterHorizontally)
        .wrapContentHeight(Alignment.Bottom)
        .padding(bottom = 200.dp),
        horizontalArrangement = Arrangement.spacedBy(70.dp)
    ) {
        Button(text = "Rock", onClick = { /*TODO*/ }) {
        }
        Text(text = "paper")
        Text(text = "Scissors")
    }
}

@Composable
fun JetpackText() {
    Text(text = "#Jetpack Compose",
        modifier = Modifier
            .wrapContentHeight(Alignment.Bottom)
            .wrapContentWidth(Alignment.CenterHorizontally),
        fontSize = 20.sp,
        fontFamily = FontFamily.SansSerif
        )
}

@Composable
fun EndResult() {
    HandImg()
    Score()
    JetpackText()
    Choice("Rock","Scissors")
    ButtonBox()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RockPaperScissorsTheme {
        EndResult()
    }
}