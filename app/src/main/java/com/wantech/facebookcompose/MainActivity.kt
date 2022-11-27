package com.wantech.facebookcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.wantech.facebookcompose.featureHome.presentation.components.NavGraphs
import com.wantech.facebookcompose.ui.theme.FacebookComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FacebookComposeTheme {
                val systemUiController = rememberSystemUiController()
                if (isSystemInDarkTheme()) {
                    systemUiController.setSystemBarsColor(
                        color = MaterialTheme.colors.background
                    )
                } else {
                    systemUiController.setSystemBarsColor(
                        color = Color.White.copy(alpha = 0.5f)
                    )
                }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }
}

