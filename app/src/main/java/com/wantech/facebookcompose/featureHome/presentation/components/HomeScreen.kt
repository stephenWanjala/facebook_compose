package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Surface(modifier = Modifier.fillMaxWidth(),
    color = MaterialTheme.colors.background) {
        TopBarSection(
            modifier = Modifier,
            onClickAdd = { /*TODO*/ },
            onClickSearch = { /*TODO*/ }) {
            
        }
    }
}