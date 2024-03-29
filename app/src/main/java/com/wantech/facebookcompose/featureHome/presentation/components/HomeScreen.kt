package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.People
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.wantech.facebookcompose.R
import com.wantech.facebookcompose.featureHome.presentation.components.homeTab.presentation.components.TopBarSection


@OptIn(ExperimentalPagerApi::class)
@Composable
@Destination(start = true)
fun HomeScreen(navigator: DestinationsNavigator) {
    val coroutineScope = rememberCoroutineScope()
    val tabItems = listOf(
        TabbedTabItem(
            icon = Icons.Rounded.Home,
            name = "Home",
            route = "home",

            ),
        TabbedTabItem(
            icon = Icons.Rounded.People,
            name = "friends",
            route = "find friend",

            ),
        TabbedTabItem(
            icon = Icons.Rounded.Home,
            name = "Feed",
            route = "feed",
            painterDrawable = R.drawable.fb_stores

        ),
        TabbedTabItem(
            icon = Icons.Default.CardGiftcard,
            name = "MarketPlace",
            route = "marketplace",

            ),
        TabbedTabItem(
            icon = Icons.Rounded.Notifications,
            name = "Notifications",
            route = "notifications",

            ),
        TabbedTabItem(
            icon = Icons.Rounded.Menu,
            name = "Notifications",
            route = "notifications",

            ),
    )
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            val pagerState = rememberPagerState()
            var onHomePage by remember {
                mutableStateOf(true)
            }
            onHomePage = pagerState.currentPage == 0


            AnimatedVisibility(
                visible = onHomePage, enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                TopBarSection(
                    modifier = Modifier,
                    onClickAdd = { /*TODO*/ },
                    onClickSearch = { /*TODO*/ }, onClickToMessenger = { /*TODO*/ })
            }



            TabbedArea(
                modifier = Modifier,
                tabItems = tabItems,
                onClickTab = {

                },
                pagerState = pagerState
            )
            Spacer(modifier = Modifier.height(16.dp))

        }


    }
}