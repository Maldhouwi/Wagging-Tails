package com.example.waggingtailsapplication.ui.theme.screens.servicedog

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
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
import androidx.compose.ui.platform.LocalContext
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
import com.example.waggingtailsapplication.navigation.ROUT_ABOUT
import com.example.waggingtailsapplication.navigation.ROUT_HOME
import com.example.waggingtailsapplication.navigation.ROUT_WALKING
import com.example.waggingtailsapplication.ui.theme.lBrown

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServicedogScreen(navController: NavHostController){
    Column (
        modifier = Modifier
            
            .verticalScroll(rememberScrollState())
            .fillMaxSize())
    {
        val mContext = LocalContext.current


        //TopAppBar
        TopAppBar(
            title = { Text(text = "Service Dogs") },
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
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("cliffeabudo@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent)
                },
                ) {
                    Icon(imageVector = Icons.Default.MailOutline,
                        contentDescription ="information",
                        tint = Color.Black,
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .size(50.dp))

                }
            }

        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))


        Box (modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
            contentAlignment = Alignment.BottomStart)
        {
            Image(painter = painterResource(id = R.drawable.servoo),
                contentDescription = "dog",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds)
            Text(
                text = "Service Dogs",
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White,
                textAlign = TextAlign.End)

        }

        Text(
            text = "What Are Service Dogs ?",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Service dogs are dogs that are specially trained to provide services to those that are specially abled in the society.By doing regular tasks like protecting them and guiding them while walking.")
        Spacer(modifier = Modifier.height(15.dp))


        Text(text = "They Provide Services To :",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Text(text = "1.The Blind",fontSize = 20.sp)
        Text(text = "2.Epileptic people",fontSize = 20.sp)
        Text(text = "3.The Disabled",fontSize = 20.sp)
        Text(text = "4.The Deaf",fontSize = 20.sp)

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Kindly Email Us Incase Of Need", fontSize = 20.sp, color = lBrown)

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Below Are Some Of The Dogs We Have Available for Adoption :",
            color = Color.DarkGray,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp))
        Spacer(modifier = Modifier.height(7.dp))

        Divider(color = Color.Black)


        Column()
        {
          //Beginning of dog one
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .height(150.dp)){
                Image(
                    painter = painterResource(id = R.drawable.jennifer),
                    contentDescription = "michael",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Text(text = "Name :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Jennifer",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Age :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "4 Years",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Title :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Guide Dog for the Blind",fontSize = 20.sp)
            }


            //End of Dog one
          Spacer(modifier = Modifier.height(10.dp))
            Divider(color = Color.Black)



              //Start of Dog two
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .height(150.dp)){
                Image(
                    painter = painterResource(id = R.drawable.brandon),
                    contentDescription = "michael",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))



            Row {
                Text(text = "Name :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Brandon",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Age :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "2 Years",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Title :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Guide Dog for the Deaf",fontSize = 20.sp)
            }

            //End Of Dog Two
            Spacer(modifier = Modifier.height(10.dp))
            Divider(color = Color.Black)


            //Beginning of dog three
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .height(150.dp)){
                Image(
                    painter = painterResource(id = R.drawable.jackieandjowie),
                    contentDescription = "michael",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Text(text = "Name :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Jack and Jowie",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Ages :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "5 and 7 years respectively",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Title :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Guide Dogs For Epileptic People",fontSize = 20.sp)
            }
            Text(text = "They Are Adopted In A Pair Since They Were Trained To Work As A Pair",fontSize = 20.sp)


            //End of Dog three
            Spacer(modifier = Modifier.height(10.dp))
            Divider(color = Color.Black)


            //Beginning of dog three
            Spacer(modifier = Modifier.height(20.dp))
            Card (modifier = Modifier
                .height(150.dp)){
                Image(
                    painter = painterResource(id = R.drawable.kazungu),
                    contentDescription = "michael",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Text(text = "Name :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Rex",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Age :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "5 years ",fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Title :",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Guide Dogs For The Disabled",fontSize = 20.sp)
            }



            //End of Dog four
            Spacer(modifier = Modifier.height(10.dp))
            Divider(color = Color.Black)










        }








    }

}



@Preview(showBackground = true)
@Composable
fun ServicedogScreenPreview(){
    ServicedogScreen(rememberNavController())
}