package com.example.waggingtailsapplication.ui.theme.screens.home

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R

import com.example.waggingtailsapplication.navigation.ROUT_ABOUT
import com.example.waggingtailsapplication.navigation.ROUT_HOME
import com.example.waggingtailsapplication.navigation.ROUT_LOGIN
import com.example.waggingtailsapplication.navigation.ROUT_SERVICEDOG
import com.example.waggingtailsapplication.navigation.ROUT_SITTING
import com.example.waggingtailsapplication.navigation.ROUT_TRAINING

import com.example.waggingtailsapplication.navigation.ROUT_WALKING
import com.example.waggingtailsapplication.ui.theme.lBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize())
    {


        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription ="back",
                        tint = Color.Black
                    )

                }
            },
            actions = {

                Button(
                    onClick = { navController.navigate(ROUT_LOGIN) },
                    colors = ButtonDefaults.buttonColors(lBlue)
                )
                {
                    Text(text = "Log In ")

                }
                Spacer(modifier = Modifier.width(3.dp))




                IconButton(onClick = { /*TODO*/ },
                    ) {
                    Icon(imageVector = Icons.Default.Info,
                        contentDescription ="information",
                        tint = Color.Black,
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_ABOUT) }
                            .padding(end = 4.dp)
                            .size(50.dp))

                }

            }

        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))

       Column (modifier = Modifier.padding(start = 20.dp, end = 20.dp)){
           Text(
               text = "Services Offered",
               fontSize = 30.sp,
               fontFamily = FontFamily.SansSerif,
               modifier = Modifier.padding(start = 20.dp)
               )
           Spacer(modifier = Modifier.height(10.dp))


           //Start of Second Column
           Column(modifier = Modifier.verticalScroll(rememberScrollState()))
           {
               //Beginning of Card
               Card(
                   modifier = Modifier
                       .clickable { navController.navigate(ROUT_WALKING) }
                       .padding(start = 10.dp, end = 10.dp)
                       .fillMaxWidth()
                       .size(height = 200.dp, width = 200.dp))
               {
                   Box (contentAlignment = Alignment.BottomEnd)
                   {
                       Image(
                           painter = painterResource(id = R.drawable.walking),
                           contentDescription = "",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.FillBounds)


                       Text(
                           text = "Dog Walking",
                           fontSize = 40.sp,
                           modifier = Modifier.padding(end = 7.dp),
                           fontFamily = FontFamily.Serif,
                           color = Color.White,
                           textAlign = TextAlign.End)
                   }

               }
               //End of Card
               Spacer(modifier = Modifier.height(15.dp))



               //Beginning of Card
               Card(
                   modifier = Modifier
                       .clickable { navController.navigate(ROUT_SERVICEDOG) }
                       .padding(start = 10.dp, end = 10.dp)
                       .fillMaxWidth()
                       .size(height = 200.dp, width = 200.dp))
               {
                   Box (contentAlignment = Alignment.BottomEnd)
                   {
                       Image(
                           painter = painterResource(id = R.drawable.dogsitting),
                           contentDescription = "",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.FillBounds)


                       Text(
                           text = "Service Dogs",
                           fontSize = 40.sp,
                           modifier = Modifier.padding(end = 7.dp),
                           fontFamily = FontFamily.Serif,
                           color = Color.White,
                           textAlign = TextAlign.End)
                   }

               }
               //End of Card
               Spacer(modifier = Modifier.height(15.dp))

               //Beginning of Card
               Card(
                   modifier = Modifier
                       .clickable { navController.navigate(ROUT_SITTING) }
                       .padding(start = 10.dp, end = 10.dp)
                       .fillMaxWidth()
                       .size(height = 200.dp, width = 200.dp))
               {
                   Box (contentAlignment = Alignment.BottomEnd)
                   {
                       Image(
                           painter = painterResource(id = R.drawable.woof),
                           contentDescription = "",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.FillBounds)


                       Text(
                           text = "Dog Sitting",
                           fontSize = 40.sp,
                           modifier = Modifier.padding(end = 7.dp),
                           fontFamily = FontFamily.Serif,
                           color = Color.White,
                           textAlign = TextAlign.End)
                   }

               }
               //End of Card
               Spacer(modifier = Modifier.height(15.dp))





           }
           //End of Second Column

       }


    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}

