package com.wantech.facebookcompose.featureHome.presentation.components.watchVideo

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun WatchVideoTopBar(
    modifier: Modifier,
    postVideo: () -> Unit,
    findFriend: () -> Unit,
    searchVideo: () -> Unit
) {
    Box(modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = "Watch",
            modifier = Modifier.align(Alignment.CenterStart),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
            IconButton(onClick = { postVideo() }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "post Video")
            }
            Spacer(modifier = Modifier.width(4.dp))
            IconButton(onClick = { postVideo() }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "post Video")
            }
            IconButton(onClick = { postVideo() }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "search Video")
            }
        }
    }
}