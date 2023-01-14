package com.wantech.facebookcompose.featureHome.presentation.components.homeTab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wantech.facebookcompose.featureHome.presentation.components.StartArea
import com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components.StoriesSection

@Composable
fun HomeTab(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 8.dp)
    ) {
        StartArea(modifier = Modifier,
            postImage = { /*TODO*/ },
            viewProfile = { /*TODO*/ },
            postSomeText = {/*TODO*/ })
    }

    StoriesSection()
}