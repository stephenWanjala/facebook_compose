package com.wantech.facebookcompose.featureHome.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wantech.facebookcompose.featureHome.presentation.components.HomeScreen
import com.wantech.facebookcompose.featureHome.presentation.util.Screen

@Composable
fun NavigationHost(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
            HomeScreen(navHostController = navHostController)
        }
    }
}