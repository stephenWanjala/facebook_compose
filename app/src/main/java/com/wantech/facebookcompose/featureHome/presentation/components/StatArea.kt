package com.wantech.facebookcompose.featureHome.presentation.components

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
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(
            onClick = { viewProfile }, modifier = Modifier
                .clip(CircleShape)
                .border(
                    width = 1.dp,
                    shape = CircleShape,
                    color = Color.DarkGray
                )
        ) {
            Image(painter = painterResource(id = R.drawable.mefb),
                contentDescription = "me",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .clickable { viewProfile() })
        }
        Spacer(modifier = Modifier.width(4.dp))
        TextButton(
            onClick = { postSomeText() },
            modifier = Modifier

                .clip(RoundedCornerShape(50))
                .border(
                    width = 0.1.dp,
                    color = Color.LightGray.copy(alpha = .3f),
                    shape = RoundedCornerShape(50)
                )
        ) {
            Text(
                text = "what is on your mind?",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface.copy(0.5f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 32.dp, vertical = 0.dp)
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

