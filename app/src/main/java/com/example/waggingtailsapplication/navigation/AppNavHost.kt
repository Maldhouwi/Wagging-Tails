package com.example.waggingtailsapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.waggingtailsapplication.ui.theme.screens.about.AboutScreen
import com.example.waggingtailsapplication.ui.theme.screens.admin.AdminLoginScreen
import com.example.waggingtailsapplication.ui.theme.screens.admin.AdminSignupScreen
import com.example.waggingtailsapplication.ui.theme.screens.home.HomeScreen
import com.example.waggingtailsapplication.ui.theme.screens.login.LoginScreen
import com.example.waggingtailsapplication.ui.theme.screens.products.AddProductsScreen
import com.example.waggingtailsapplication.ui.theme.screens.products.ViewProductsScreen
import com.example.waggingtailsapplication.ui.theme.screens.servicedog.ServicedogScreen
import com.example.waggingtailsapplication.ui.theme.screens.signup.SignupScreen
import com.example.waggingtailsapplication.ui.theme.screens.sitting.SittingScreen
import com.example.waggingtailsapplication.ui.theme.screens.splash.SplashScreen
import com.example.waggingtailsapplication.ui.theme.screens.training.TrainingScreen
import com.example.waggingtailsapplication.ui.theme.screens.walking.WalkingScreen



@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){

        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }



        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }

        composable(ROUT_WALKING){
            WalkingScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_SERVICEDOG){
            ServicedogScreen(navController)
        }

        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController)
        }

        composable(ROUT_TRAINING){
            TrainingScreen(navController)
        }

        composable(ROUT_SITTING){
            SittingScreen(navController)
        }


        composable(ROUT_ADMINLOGIN){
           AdminLoginScreen(navController)
        }

        composable(ROUT_ADMINSIGNUP){
            AdminSignupScreen(navController)
        }







    }

}