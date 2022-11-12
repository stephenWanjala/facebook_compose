package com.wantech.facebookcompose.featureHome.presentation.components.marketPlace

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MarketPlaceTab(modifier: Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
    ) {
        item {
            MarketPlaceTopBar(
                modifier = Modifier,
                postVideo = { /*TODO*/ },
            ) {

            }
        }
    }
}