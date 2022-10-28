package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabbedArea(
    modifier: Modifier,
    tabItems: List<TabbedTabItem>,
    onClickTab: (TabbedTabItem) -> Unit,
    pagerState: PagerState
) {
    var selectIndex by remember {
        mutableStateOf(0)
    }
    Column() {



        val tabIndex = pagerState.currentPage
        val coroutineScope = rememberCoroutineScope()
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            backgroundColor = MaterialTheme.colors.background,
            contentColor = MaterialTheme.colors.onBackground,
            divider = {
                TabRowDefaults.Divider(
                    Modifier.wrapContentSize(Alignment.BottomStart),
                )
            },
            indicator = {
                TabRowDefaults.Indicator(
                    color = MaterialTheme.colors.primary,
                    height = TabRowDefaults.IndicatorHeight * 1.5F,
                    modifier = Modifier
//                        .tabIndicatorOffset(it[selectIndex])
                        .pagerTabIndicatorOffset(pagerState, it)
                )
            }

        ) {
            tabItems.forEachIndexed { index, tabItem ->
                Tab(
                    selected = selectIndex == index,
                    onClick = {
                        selectIndex = index
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(selectIndex)

                        }
                    },
                    unselectedContentColor = MaterialTheme.colors.onBackground,
                    selectedContentColor = MaterialTheme.colors.primary,
//                  interactionSource =


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

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f),
            count = tabItems.size
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

            }

        }
    }
}