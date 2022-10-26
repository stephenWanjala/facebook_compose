package com.wantech.facebookcompose.featureHome.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.wantech.facebookcompose.R
@Composable
fun HomeScreen(navHostController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            TopBarSection(
                modifier = Modifier,
                onClickAdd = { /*TODO*/ },
                onClickSearch = { /*TODO*/ }) {

            }
            Spacer(modifier = Modifier.height(8.dp))
            TabbedArea(modifier = Modifier,
                tabItems = listOf(
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
                        name = "Home",
                        route = "home",
                        painterDrawable = R.drawable.fb_stores

                    ),
                    TabbedTabItem(
                        icon = Icons.Default.CardGiftcard,
                        name = "Home",
                        route = "home",

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
                ),
                onClickTab = {})
            Spacer(modifier = Modifier.height(16.dp))
            StartArea(modifier = Modifier,
                postImage = { /*TODO*/ },
                viewProfile = { /*TODO*/ },
                postSomeText = {/*TODO*/ })
        }


    }
}