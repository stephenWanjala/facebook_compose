package com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
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
import androidx.compose.ui.graphics.ColorFilter
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

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
    ) {
        Text(
            text = "facebook",
            style = MaterialTheme.typography.h4,

//            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterStart)
        )

        Row(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

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
                icon = R.drawable.facebook_messenger,
                desc = "send message",

                )
        }

    }
}


@Composable
fun RoundIconButton(onClick: () -> Unit, icon: ImageVector, desc: String) {

    Icon(
        imageVector = icon, contentDescription = desc,
        modifier = Modifier
            .size(40.dp)
            .padding(4.dp)
            .clickable { onClick() }
            .background(
                color = Color.DarkGray,
                shape = CircleShape
            )
            .clip(CircleShape)
    )
}


@Composable
fun RoundIconButton(onClick: () -> Unit, icon: Int, desc: String) {
    Image(
        painter = painterResource(id = icon), contentDescription = desc,
        modifier = Modifier
            .clickable { onClick() }
            .size(40.dp)
            .padding(4.dp)
            .aspectRatio(
                matchHeightConstraintsFirst = false,
                ratio = 1f
            )
            .background(
                color = Color.DarkGray,
                shape = CircleShape
            )
            .clip(CircleShape),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,
        colorFilter = ColorFilter.tint(
            color = Color.LightGray,
        ),
        alpha = .5f
    )
}

