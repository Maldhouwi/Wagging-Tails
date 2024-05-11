package com.example.waggingtailsapplication.ui.theme.screens.admin

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R
import com.example.waggingtailsapplication.data.AuthViewModel
import com.example.waggingtailsapplication.navigation.ROUT_ADMINLOGIN

import com.example.waggingtailsapplication.ui.theme.lBlue


@Composable
fun AdminSignupScreen(navController: NavHostController){
    Column(modifier = Modifier
        .paint(
            painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds
        )
        .fillMaxSize())
    {

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        Spacer(modifier = Modifier.height(60.dp))
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
            Image(painter = painterResource(id = R.drawable.register),
                contentDescription = "register",
                modifier = Modifier.size(200.dp))
        }


        //Name
        Spacer(modifier = Modifier.height(50.dp))
        TextField(
            value = name,
            onValueChange = {name = it},
            placeholder = { Text(text = "Name") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth())
        Spacer(modifier = Modifier.height(10.dp))
        //End of Name

        //Email
        Spacer(modifier = Modifier.height(15.dp))
        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text(text = "Email Address") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth())
        Spacer(modifier = Modifier.height(10.dp))
        //End of Email


        //Password
        Spacer(modifier = Modifier.height(15.dp))
        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = { Text(text = "Password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth())
        Spacer(modifier = Modifier.height(30.dp))
        //End of password


        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)



        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = {  authViewModel.adminsignup(name, email, password) },
                modifier = Modifier
                    .clickable { navController.navigate(ROUT_ADMINLOGIN) }
                    .padding(start = 30.dp, end = 30.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(lBlue))
            {
                Text(text = "SIGN UP")
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Already have an account ? Log In",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clickable { navController.navigate(ROUT_ADMINLOGIN) }
                .fillMaxWidth())









    }



}

@Composable
@Preview(showBackground = true)
fun AdmiSignupScreenPreview(){
    AdminSignupScreen(rememberNavController())
}