package com.example.waggingtailsapplication.ui.theme.screens.about

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize())
    {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "About Us") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="back",
                        tint = Color.Black,
                        modifier = Modifier.clickable { navController.navigate(ROUT_HOME) })

                }
            }
        )
        //End of TopAppBar


        Box (modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
            contentAlignment = Alignment.BottomStart)
        {
            Image(painter = painterResource(id = R.drawable.information),
                contentDescription = "dog",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds)

            Text(
                text = "Wagging Tails",
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White,
                textAlign = TextAlign.End)

        }

        Spacer(modifier = Modifier.height(20.dp))


        Box (
            modifier = Modifier
                .padding(start = 90.dp)
                .size(width = 180.dp, height = 250.dp))
        {
            Card(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(painter = painterResource(id =R.drawable.chief ),
                    contentDescription = "ceo",
                    modifier = Modifier
                        .fillMaxSize())

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Our Founder",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Mr Mzhamane Nhlapo created Wagging Tails in the year 2016 to curb a problem that he had experienced greatly as an employee doing a 9-5 job",
            color = Color.Black,
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "About Us",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Wagging Tails was created with the main purpose of providing general dog services to customers.One of the main services is Dog walking which is very important but most people are too busy or are employed and can't find time to do it",
            color = Color.Black,
            fontSize = 20.sp)



        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Why Us",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "1.Our main concern is the well being of the dog",
            color = Color.Black,
            fontSize = 15.sp)
        Text(text = "2.We have employees that foster good customer relations",
            color = Color.Black,
            fontSize = 15.sp)
        Text(text = "3.We are very punctual when picking or returning your dog",
            color = Color.Black,
            fontSize = 15.sp)
        Spacer(modifier = Modifier.height(4.dp))










    }

}



@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}