package com.wantech.facebookcompose.featureHome.presentation.components.watchVideo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WatchVideoTab(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        WatchVideoTopBar(
            modifier = Modifier,
            postVideo = { /*TODO*/ },
            findFriend = { /*TODO*/ }
        ) {

        }
    }
}