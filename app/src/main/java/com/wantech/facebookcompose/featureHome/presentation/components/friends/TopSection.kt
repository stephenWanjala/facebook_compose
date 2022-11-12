package com.wantech.facebookcompose.featureHome.presentation.components.friends

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TopSection(
    searchFriend: () -> Unit,
    modifier: Modifier
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "Friends",
            modifier = Modifier.align(Alignment.TopStart),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h4
        )
        IconButton(
            onClick = { searchFriend() },
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = "find friend")
        }
    }
}