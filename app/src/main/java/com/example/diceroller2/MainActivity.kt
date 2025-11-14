package com.example.diceroller2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diceroller2.ui.theme.DiceRoller2Theme


private val Unit.roll: Any
lateinit var modifier: Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRoller2Theme {

                DiceRollerApp()
                }
            }
        }
    }




@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
     column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
         Image(painter = painterResource(R.drawable.dice_1)
                     contentDescription = '1')
         spacer(modifier =modifier.height(16.dp))

         Button(onClick = { /*= TODO()*/ }) {
             Text(StringResourse(R.string.roll))
         }
val imageResource = when (result) {
    1-> R.drawable.dice_1
    2-> R.drawable.dice_2
    3-> R.drawable.dice_3
    4-> R.drawable.dice_4
    5-> R.drawable.dice_5
    6-> R.drawable.dice_6
}
     }
}

@Composable
fun Image(painter: contentDescription, x1: Char) {
    TODO("Not yet implemented")
}


@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(val result = 1)
         modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)
    }
