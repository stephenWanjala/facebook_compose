package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wantech.facebookcompose.R


@Composable
fun TopBarSection(
    modifier: Modifier,
    onClickAdd: () -> Unit,
    onClickSearch: () -> Unit,
    onClickToMessenger: () -> Unit
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "facebook",
            style = MaterialTheme.typography.h4,
//            fontWeight = FontWeight.Bold,
//        modifier = Modifier.weight(.3f)
        )
        Spacer(modifier = Modifier.weight(1f))
//
//        Spacer(modifier = Modifier.width(32.dp))
        RoundIconButton(
            onClick = { onClickAdd() },
            icon = Icons.Rounded.Add,
            desc = "add post real"
        )
        Spacer(modifier = Modifier.width(4.dp))
        RoundIconButton(
            onClick = { onClickSearch() },
            icon = Icons.Rounded.Search,
            desc = "Search facebook"
        )
        Spacer(modifier = Modifier.width(4.dp))
        RoundIconButton(
            onClick = { onClickToMessenger() },
            icon = R.drawable.mess_im,
            desc = "send message"
        )

    }
}


@Composable
fun RoundIconButton(onClick: () -> Unit, icon: ImageVector, desc: String) {
    IconButton(
        onClick = { onClick() },
        modifier = Modifier
//            .size(40.dp)
//            .padding(4.dp)
            .clip(CircleShape)
            .background(
                color = Color.DarkGray,
                shape = CircleShape
            ),

        ) {
        Icon(
            imageVector = icon, contentDescription = desc,
            modifier = Modifier
//                .size(30.dp)
//                .clip(CircleShape)
        )
    }

}


@Composable
fun RoundIconButton(onClick: () -> Unit, icon: Int, desc: String) {
    IconButton(
        onClick = { onClick() },
        modifier = Modifier
//            .size(40.dp)
//            .padding(4.dp)
            .clip(CircleShape)
            .background(
                color = Color.DarkGray,
                shape = CircleShape
            ),

        ) {
        Image(
            painter = painterResource(id = icon), contentDescription = desc,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
            alpha = .5f
        )
    }

}