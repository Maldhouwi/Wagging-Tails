package com.example.waggingtailsapplication.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R
import com.example.waggingtailsapplication.data.AuthViewModel
import com.example.waggingtailsapplication.navigation.ROUT_LOGIN
import com.example.waggingtailsapplication.navigation.ROUT_SIGNUP
import com.example.waggingtailsapplication.ui.theme.lBlue

@Composable
fun LoginScreen(navController: NavHostController){

    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize())
    {
        var email by remember { mutableStateOf("")}
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(80.dp))


        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
            Image(painter = painterResource(id = R.drawable.login),
                contentDescription = "register",
                modifier = Modifier.size(200.dp))
        }



        //Email
        Spacer(modifier = Modifier.height(150.dp))
        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text(text = "Email Address") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth())
        Spacer(modifier = Modifier.height(10.dp))
        //End of email


        //Password
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = { androidx.compose.material3.Text(text = "Password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth())
        Spacer(modifier = Modifier.height(30.dp))
        //End of password

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)



        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
            Button(
                onClick = { authViewModel.login(email, password) },
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(lBlue),
                )
            {
                Text(
                    text = "LOG IN")
            }
        }
        Spacer(modifier =Modifier.height(15.dp))

        androidx.compose.material3.Text(
            text = "Don't Have An Account ? Sign Up",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clickable { navController.navigate(ROUT_SIGNUP) }
                .fillMaxWidth())











    }



}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}
