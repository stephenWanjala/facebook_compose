package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.*
import com.wantech.facebookcompose.featureHome.presentation.components.friends.FindFriendsTab
import com.wantech.facebookcompose.featureHome.presentation.components.homeTab.HomeTab
import com.wantech.facebookcompose.featureHome.presentation.components.marketPlace.MarketPlaceTab
import com.wantech.facebookcompose.featureHome.presentation.components.watchVideo.WatchVideoTab
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabbedArea(
    modifier: Modifier,
    tabItems: List<TabbedTabItem>,
    onClickTab: (TabbedTabItem) -> Unit,
    pagerState: PagerState
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }

    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(pagerState.currentPage) {
        selectedTabIndex = pagerState.currentPage
    }
    Column(modifier = modifier.fillMaxWidth()) {


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
                    selected = selectedTabIndex == index,
                    onClick = {
                        selectedTabIndex =index
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(selectedTabIndex)


                        }
                    },
                    unselectedContentColor = MaterialTheme.colors.onBackground,
                    selectedContentColor = MaterialTheme.colors.primary,

                ) {
                    if (tabItem.painterDrawable != null) {
                        Icon(
                            painter = painterResource(id = tabItem.painterDrawable),
                            contentDescription = tabItem.name,
                            modifier = Modifier.size(30.dp)
                        )
                    } else {
                        Icon(
                            imageVector = tabItem.icon, contentDescription = tabItem.name,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                }
            }

        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f),
            count = tabItems.size,
        ) { page ->
            when (page) {
                0 -> {
                    HomeTab(modifier = Modifier)

                }
                1 -> {
                    FindFriendsTab(modifier = Modifier)
                }
                2 -> {
                    WatchVideoTab(modifier = Modifier)
                }
                3 -> {
                    MarketPlaceTab(modifier = Modifier)
                }
                4 -> {

                }
                5 -> {

                }

            }

        }
    }
}