package com.example.navprac

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screens{
    ScreenA,
    ScreenB,
    ScreenC,
    ScreenD
}
@Composable
fun NavPracApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screens.ScreenA.name){
        composable(route= Screens.ScreenA.name){
            ScreenLayout(
                mainLetter = "A",
                onNextButtonClicked = {navController.navigate(Screens.ScreenB.name)},
                navController= navController
            )

        }
        composable(route = Screens.ScreenB.name){
            ScreenLayout(
                mainLetter = "B",
                onNextButtonClicked = {navController.navigate(Screens.ScreenC.name)},
                onCancelButtonClicked = {navController.popBackStack(Screens.ScreenA.name, inclusive = false)},
                navController= navController
            )
        }
        composable(route = Screens.ScreenC.name){
            ScreenLayout(
                mainLetter = "C",
                onNextButtonClicked = {navController.navigate(Screens.ScreenD.name)},
                onCancelButtonClicked = {navController.popBackStack(Screens.ScreenA.name, inclusive = false)},
                navController= navController
            )
        }
        composable(route = Screens.ScreenD.name){
            ScreenLayout(
                mainLetter = "D",
                onCancelButtonClicked = {navController.popBackStack(Screens.ScreenA.name, inclusive = false)},
                navController= navController
            )
        }
    }
}