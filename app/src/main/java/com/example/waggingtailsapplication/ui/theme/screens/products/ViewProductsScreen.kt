package com.example.waggingtailsapplication.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.data.ProductViewModel
import com.example.waggingtailsapplication.models.Product
import coil.compose.rememberAsyncImagePainter
import com.example.waggingtailsapplication.navigation.ADD_PRODUCTS_URL
import com.example.waggingtailsapplication.navigation.ROUT_HOME
import com.example.waggingtailsapplication.ui.theme.lBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProductsScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = ProductViewModel(navController, context)


        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.allProducts(emptyProductState, emptyProductsListState)


        //TopAppBar
        TopAppBar(
            title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="back",
                        tint = Color.Black,
                        modifier = Modifier.clickable { navController.navigate(ADD_PRODUCTS_URL) }
                    )

                }
            }
        )
        //End of TopAppBar

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Dogs Enrolled",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Green)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(modifier = Modifier.padding(20.dp)){
                items(products){
                    ProductItem(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,
                        productRepository = productRepository,
                        productImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun ProductItem(name:String, quantity:String, price:String, id:String,
                navController:NavHostController,
                productRepository:ProductViewModel, productImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name, fontSize = 20.sp,modifier = Modifier.padding(start = 20.dp))
        Text(text = quantity, fontSize = 20.sp,modifier = Modifier.padding(start = 20.dp))
        Text(text = price, fontSize = 20.sp,modifier = Modifier.padding(start = 20.dp))
        Image(
            painter = rememberAsyncImagePainter(productImage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(250.dp)
        )
        Button(onClick = {
            productRepository.deleteProduct(id)
        }, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp),
            colors = ButtonDefaults.buttonColors(lBlue))
        {
            Text(text = "Delete")
        }
        Spacer(modifier = Modifier.height(5.dp))
        Divider(color = Color.Black, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(5.dp))
           /*
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PRODUCTS+"/$id")
        }) {
            Text(text = "Update")
        }
        */
    }

}



@Preview(showBackground = true)
@Composable
fun ViewProductsScreenPreview(){
    ViewProductsScreen(rememberNavController())
}

