package com.example.waggingtailsapplication.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R
import com.example.waggingtailsapplication.navigation.ROUT_HOME
import com.example.waggingtailsapplication.navigation.ROUT_SIGNUP

import com.example.waggingtailsapplication.ui.theme.Brown
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController:NavHostController){

    Column(
        modifier = Modifier
            .background(Brown)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(3000)
            navController.navigate(ROUT_HOME)
        }

        Image(painter = painterResource(id = R.drawable.paw),
            contentDescription ="paw",
            modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Wagging Tails",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive)

    }

}




@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}