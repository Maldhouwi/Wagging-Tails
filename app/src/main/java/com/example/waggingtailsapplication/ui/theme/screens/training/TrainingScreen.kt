package com.example.waggingtailsapplication.ui.theme.screens.training

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R
import com.example.waggingtailsapplication.navigation.ADD_PRODUCTS_URL
import com.example.waggingtailsapplication.navigation.ROUT_ADMINLOGIN
import com.example.waggingtailsapplication.navigation.ROUT_HOME
import com.example.waggingtailsapplication.navigation.VIEW_PRODUCTS_URL
import com.example.waggingtailsapplication.ui.theme.lGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrainingScreen(navController: NavHostController){
    Column(
        modifier = Modifier
           
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),

    ) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Training") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="back",
                        tint = Color.Black,
                        modifier = Modifier.clickable { navController.navigate(ROUT_HOME) }
                    )

                }
            },
            actions = {
                Button(onClick = {
                    navController.navigate(ROUT_ADMINLOGIN)
                }, colors = ButtonDefaults.buttonColors(Color.White)) {
                    Text(text = "")
                }
                Spacer(modifier = Modifier.width(5.dp))
            }
        )
        //End of TopAppBar
        Text(
            text = "Dog Training",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )

        Text(text = "Wagging Tails offers a variety of programs to train dogs", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Programs Offered",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Security Dogs",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.padding(start = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.security),
                contentDescription ="",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp))

            Spacer(modifier = Modifier.width(15.dp))

            Image(
                painter = painterResource(id = R.drawable.security),
                contentDescription ="",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp))


        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "This training aims to improve the physicality of your guard dogs.This is through different exercises,good diet and scenario training", fontSize = 20.sp)


        Text(
            text = "Charges",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Text(text = "3-5 years ->  Ksh 11999", fontSize = 20.sp)
        Text(text = "6-7 years ->  Ksh 14999", fontSize = 20.sp)
        Text(text = "8-12 years ->  Ksh 19999", fontSize = 20.sp)
        Text(text = "13 and above years ->  Ksh 25000", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(30.dp))

  //Puppy Training
        Text(
            text = "Puppy Training",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.padding(start = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.kutraining),
                contentDescription ="",
                modifier = Modifier
                    .size(150.dp)
                    )

            Spacer(modifier = Modifier.width(15.dp))

            Image(
                painter = painterResource(id = R.drawable.kutraining),
                contentDescription ="",
                modifier = Modifier
                    .size(150.dp)
                   )


        }
        Spacer(modifier = Modifier.height(15.dp))


        Text(text = "This training aims to better the discipline of your puppies from a young age.This is throgh good diet and specific routinely habits.", fontSize = 20.sp)



        Text(text = "This program only runs for puppies between 1-2 years and costs only KSH 8999", fontSize = 20.sp)
      //End Of puppy

        Text(
            text = "Discipline Training",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row(modifier = Modifier.padding(start = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.train),
                contentDescription ="",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp))

            Spacer(modifier = Modifier.width(15.dp))

            Image(
                painter = painterResource(id = R.drawable.trainer),
                contentDescription ="",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp))


        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "This training aims to improve the discipline of your dogs to your commands.", fontSize = 20.sp)


        Text(
            text = "Charges",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Text(text = "3-5 years ->  Ksh 9000", fontSize = 20.sp)
        Text(text = "6-7 years ->  Ksh 13000", fontSize = 20.sp)
        Text(text = "8-12 years ->  Ksh 16000", fontSize = 20.sp)
        Text(text = "13 and above years ->  Ksh 18000", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(30.dp))



        OutlinedButton(onClick = {
            navController.navigate(ADD_PRODUCTS_URL)
        },  colors = ButtonDefaults.buttonColors(Color.Gray)) {
            Text(text = "Enroll Now")
        }
        Spacer(modifier = Modifier.height(20.dp))

    }

}

@Preview(showBackground = true)
@Composable
fun TrainingScreenPreview(){
    TrainingScreen(rememberNavController())
}