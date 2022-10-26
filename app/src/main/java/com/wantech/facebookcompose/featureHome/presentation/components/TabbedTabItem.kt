package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.ui.graphics.vector.ImageVector


data class TabbedTabItem(
    val icon: ImageVector,
    val route: String,
    val name: String,
    val painterDrawable: Int? = null
)
