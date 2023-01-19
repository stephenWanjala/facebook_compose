package com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddPhotoAlternate
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.wantech.facebookcompose.R


@Composable
fun StartArea(
    modifier: Modifier, postImage: () -> Unit, viewProfile: () -> Unit, postSomeText: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.mefb),
            contentDescription = "me",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(
                    width = 1.dp,
                    shape = CircleShape,
                    color = Color.DarkGray
                )
                .clickable { viewProfile() },
        )
        Spacer(modifier = Modifier.width(4.dp))

        OutlinedButton(
            onClick = {
                postSomeText()
            },
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(40.dp),
//                .clip(RoundedCornerShape(20.dp)),
            shape = RoundedCornerShape(20.dp),
        ) {
            Text(
                text = "What's on your mind?",
                textAlign = TextAlign.Center,
                color = Color.White.copy(alpha = 0.5f),
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            )
        }


        Spacer(modifier = Modifier.width(8.dp))
        IconButton(
            onClick = { postImage() },

            ) {
            Icon(
                imageVector = Icons.Rounded.AddPhotoAlternate,
                contentDescription = "post Image",
                tint = Color.Green.copy(alpha = 0.3f)
            )
        }
    }
}

