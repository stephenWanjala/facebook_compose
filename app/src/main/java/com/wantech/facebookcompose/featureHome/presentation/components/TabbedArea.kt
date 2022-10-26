package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
        divider = {
            TabRowDefaults.Divider(
                Modifier.wrapContentSize(Alignment.BottomStart),
            )
        },
        indicator = {
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .tabIndicatorOffset(it[selectIndex]),
                color = MaterialTheme.colors.primary,
                height = TabRowDefaults.IndicatorHeight * 1.5F
            )
        }

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
                if (tabItem.painterDrawable != null) {
                    Icon(
                        painter = painterResource(id = tabItem.painterDrawable),
                        contentDescription = tabItem.name,
                        modifier = Modifier.size(40.dp)
                    )
                } else {
                    Icon(
                        imageVector = tabItem.icon, contentDescription = tabItem.name,
                        modifier = Modifier.size(40.dp)
                    )
                }

            }
        }

    }
}