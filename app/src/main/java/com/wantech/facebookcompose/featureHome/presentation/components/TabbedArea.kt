package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TabbedArea(
    modifier: Modifier,
    tabItems: List<TabbedTabItem>,
    onClickTab: (TabbedTabItem) -> Unit
) {
    var selectIndex by remember {
        mutableStateOf(0)
    }
    TabRow(
        selectedTabIndex = selectIndex,
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,

        ) {
        tabItems.forEachIndexed { index, tabItem ->
            Tab(
                selected = selectIndex == index,
                onClick = {
                    selectIndex = index
                },
                unselectedContentColor = MaterialTheme.colors.onBackground,
                selectedContentColor = MaterialTheme.colors.primary,

                ) {
                Icon(
                    imageVector = tabItem.icon, contentDescription = tabItem.name,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

    }
}