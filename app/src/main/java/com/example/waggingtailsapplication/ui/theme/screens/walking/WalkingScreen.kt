package com.example.waggingtailsapplication.ui.theme.screens.walking

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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.R
import com.example.waggingtailsapplication.navigation.ROUT_ABOUT
import com.example.waggingtailsapplication.navigation.ROUT_HOME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WalkingScreen(navController: NavHostController){

    Column(
        modifier = Modifier
            .fillMaxSize())
    {
        val mContext = LocalContext.current



        //TopAppBar
        TopAppBar(
            title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription ="back",
                        tint = Color.Black,
                        modifier = Modifier.clickable { navController.navigate(ROUT_HOME) }
                    )

                }
            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))

        Column (
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .verticalScroll(rememberScrollState()))
        {
            //Start of Row1
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .height(150.dp)
                    .fillMaxWidth())
            {
                Card (modifier = Modifier
                    .height(150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.michael),
                        contentDescription = "michael",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.
                        height(150.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))




                Column {
                    Text(
                        text = "Michael",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Certified Dog Walker",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "8 Years experience working with dogs",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Located along Thika Rd",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Text(
                            text = "Call +254 720394856",
                            fontSize = 15.sp,
                        )

                        IconButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720394856".toUri()
                            mContext.startActivity(callIntent)
                        },
                            modifier = Modifier.padding(start = 50.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Call,
                                contentDescription ="information",
                                tint = Color.Green,
                                modifier = Modifier
                                    .size(70.dp))

                        }
                    }
                }




            }
            //End Of row1

            Spacer(modifier = Modifier.height(15.dp))

            //Start of Row2
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .height(150.dp)
                    .fillMaxWidth())
            {
                Card (modifier = Modifier
                    .height(150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.kimani),
                        contentDescription = "michael",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(120.dp)
                            .height(150.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))




                Column {
                    Text(
                        text = "Kimani",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Certified Dog Walker",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "5 Years experience working with dogs",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Located along Ngong Rd",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Text(
                            text = "Call +254 720220671",
                            fontSize = 15.sp,
                        )

                        IconButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720220671".toUri()
                            mContext.startActivity(callIntent)
                        },
                            modifier = Modifier.padding(start = 50.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Call,
                                contentDescription ="information",
                                tint = Color.Green,
                                modifier = Modifier


                                    .size(70.dp))

                        }
                    }
                }

            }
            //End Of row2

            Spacer(modifier = Modifier.height(15.dp))


            //Start of Row3
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .height(150.dp)
                    .fillMaxWidth())
            {
                Card (modifier = Modifier
                    .width(120.dp)
                    .height(150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.josephat),
                        contentDescription = "michael",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.
                        height(150.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))




                Column {
                    Text(
                        text = "Josephat",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Certified Dog Walker",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "5 Years experience working with dogs",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Located along Mombasa Rd",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Text(
                            text = "Call +254 720125634",
                            fontSize = 15.sp,
                        )

                        IconButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720125634".toUri()
                            mContext.startActivity(callIntent)
                        },
                            modifier = Modifier.padding(start = 50.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Call,
                                contentDescription ="information",
                                tint = Color.Green,
                                modifier = Modifier


                                    .size(70.dp))

                        }
                    }
                }




            }
            //End Of row3

         Spacer(modifier = Modifier.height(15.dp))

            //Start of Row4
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .height(150.dp)
                    .fillMaxWidth())
            {
                Card (modifier = Modifier
                    .width(120.dp)
                    .height(150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.joseph),
                        contentDescription = "michael",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.
                        height(150.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))


                Column {
                    Text(
                        text = "Joseph",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Certified Dog Walker",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "3 Years experience working with dogs",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Located along Kiambu Rd",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Text(
                            text = "Call +254 724434200",
                            fontSize = 15.sp,
                        )

                        IconButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0724434200".toUri()
                            mContext.startActivity(callIntent)
                        },
                            modifier = Modifier.padding(start = 50.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Call,
                                contentDescription ="information",
                                tint = Color.Green,
                                modifier = Modifier


                                    .size(70.dp))

                        }
                    }
                }




            }
            //End Of row4


            Spacer(modifier = Modifier.height(15.dp))

            //Start of Row5
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .height(150.dp)
                    .fillMaxWidth())
            {
                Card (modifier = Modifier
                    .width(120.dp)
                    .height(150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.karen),
                        contentDescription = "michael",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.
                        height(150.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))


                Column {
                    Text(
                        text = "Karen",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Volunteer Dog Walker",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "1 Year experience working with dogs",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Located anywhere around CBD",
                        fontSize = 15.sp,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Text(
                            text = "Call +254 720803475",
                            fontSize = 15.sp,
                        )

                        IconButton(onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720803475".toUri()
                            mContext.startActivity(callIntent)
                        },
                            modifier = Modifier.padding(start = 50.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Call,
                                contentDescription ="information",
                                tint = Color.Green,
                                modifier = Modifier


                                    .size(70.dp))

                        }
                    }
                }




            }
            //End Of row5







        }























    }

}



@Preview(showBackground = true)
@Composable
fun WalkingScreenPreview(){
    WalkingScreen(rememberNavController())
}