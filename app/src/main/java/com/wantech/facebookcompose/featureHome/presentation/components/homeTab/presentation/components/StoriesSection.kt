package com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ExperimentalMotionApi

@OptIn(ExperimentalFoundationApi::class, ExperimentalMotionApi::class)
@Composable
fun StoriesSection() {
    val listState = rememberLazyListState()
    val motionPressVal by remember {
        derivedStateOf { listState.firstVisibleItemIndex }
    }
    val motionProgress by animateFloatAsState(
        targetValue = motionPressVal.toFloat()
    ) {
        (it + 1) / listState.layoutInfo.totalItemsCount
    }


    LazyRow(
        state = listState,
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.wrapContentHeight(),
        content = {
            stickyHeader {
                HeadStoryItem(progress = motionProgress.coerceIn(0f, 1f))
            }
            items(sampleStories) { story ->
                FbStoryItem(story = story)
            }
        })
}