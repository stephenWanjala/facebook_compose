package com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FbStoryItem(
    modifier: Modifier = Modifier,
    story: FbStory
) {
    Card(
        modifier = modifier.size(height = 200.dp, width = 120.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = story.imagePost),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize(),
                contentDescription = null
            )
            Surface(
                modifier = Modifier
                    .size(60.dp)
                    .align(Alignment.TopStart)
                    .padding(8.dp),
                border = BorderStroke(width = 3.dp, color = Color(0xFF4267B2)),
                shape = CircleShape
            ) {
                Image(
                    painter = painterResource(id = story.profile),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = story.userName,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(8.dp),
                style = MaterialTheme.typography.subtitle2.copy(
                    fontSize = 14.sp,
                    color = Color.White,
                )
            )
        }
    }
}