package com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components

import androidx.annotation.DrawableRes
import com.wantech.facebookcompose.R

data class FbStory(
    val userName: String,
    @DrawableRes
    val profile: Int,
    @DrawableRes
    val imagePost: Int
)

val sampleStories = listOf(
    FbStory(
        userName = "Alex Main",
        profile = R.drawable.maina,
        imagePost = R.drawable.maina
    ),

    FbStory(
        userName = "Richie",
        profile = R.drawable.fb_firebg,
        imagePost = R.drawable.rich_l
    ),
    FbStory(
        userName = "Gerald Alumasa",
        profile = R.drawable.chui_cat,
        imagePost = R.drawable.tulsa_king
    ),
    FbStory(
        userName = "C_Boy",
        profile = R.drawable.sterio,
        imagePost = R.drawable.sterio
    ),
    FbStory(
        userName = "James Coder",
        profile = R.drawable.code_desk,
        imagePost = R.drawable.code_desk
    ),
    FbStory(
        userName = "Carina jame",
        profile = R.drawable.maina,
        imagePost = R.drawable.mefb
    ),
)
