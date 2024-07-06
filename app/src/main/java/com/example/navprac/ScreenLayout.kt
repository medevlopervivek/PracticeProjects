package com.example.navprac

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenLayout(
    mainLetter: String,
    onNextButtonClicked: ()->Unit ={},
    onCancelButtonClicked: () -> Unit ={},
    navController: NavHostController,
) {
    Log.d("viv", "${navController.currentBackStackEntry}")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier
                .size(width = 250.dp, height = 250.dp)
        ) {
            Text(
                text = mainLetter,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                textAlign = TextAlign.Center,
                fontSize = 150.sp
            )
        }
        Spacer(modifier = Modifier.size(30.dp))
        Row(modifier= Modifier
            .fillMaxWidth(.8f)
            .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth(.5f),
                onClick = onCancelButtonClicked,
                enabled = navController.previousBackStackEntry !=null
            ) {
                Text(text = "Cancel")
            }
            OutlinedButton(
                modifier = Modifier
                    .fillMaxWidth(1f),
                onClick = onNextButtonClicked,
                enabled = true
            ) {
                Text(text = "Next")

            }
        }
    }

}
@Preview(showSystemUi = true)
@Composable
fun ScreenLayoutPreview(
    mainLetter: String= "A",
    onNextButtonClicked: () -> Unit={},
    navController: NavHostController= rememberNavController()){
    ScreenLayout(
        mainLetter= mainLetter,
        onNextButtonClicked=onNextButtonClicked,
        navController=navController
        )
}