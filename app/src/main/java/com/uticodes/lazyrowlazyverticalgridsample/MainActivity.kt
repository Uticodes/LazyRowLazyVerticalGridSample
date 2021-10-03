package com.uticodes.lazyrowlazyverticalgridsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.uticodes.lazyrowlazyverticalgridsample.models.dummyQuickOrder
import com.uticodes.lazyrowlazyverticalgridsample.models.dummyYourFavouriteItem
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.Black
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.LazyRowLazyVerticalGridSampleTheme
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.Poppins
import com.uticodes.lazyrowlazyverticalgridsample.utils.LazyRowList
import com.uticodes.lazyrowlazyverticalgridsample.utils.fontDimensionResource
import com.uticodes.lazyrowlazyverticalgridsample.views.EverythingYouLoveCard
import com.uticodes.lazyrowlazyverticalgridsample.views.YourFavourites

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FavouriteView()
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun FavouriteView() {
    LazyRowLazyVerticalGridSampleTheme {
        var searchQuery by remember { mutableStateOf("") }
        var isInvalidSearch by remember { mutableStateOf(false) }
        val state = rememberScrollState()
        LaunchedEffect(Unit) { state.animateScrollTo(1) }
        val scrollListState = rememberLazyListState()

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .scrollable(scrollListState, orientation = Orientation.Vertical),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Your Favourite",
                    modifier = Modifier.padding(
                        top = dimensionResource(id = R.dimen.thirty_dp),
                        bottom = dimensionResource(id = R.dimen.eight_dp),
                        start = dimensionResource(R.dimen.twenty_two_dp),
                    ),
                    style = TextStyle(
                        fontSize = fontDimensionResource(id = R.dimen.twenty_two_dp),
                        color = Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Poppins
                    )
                )
                LazyRowList(
                    modifier = Modifier.padding(start = dimensionResource(R.dimen.twenty_two_dp), ),
                    onItemSelect = {
                        dummyYourFavouriteItem[it]
                    }, count = dummyYourFavouriteItem.size) { index ->
                    YourFavourites(
                        icon = dummyYourFavouriteItem[index].icon,
                        items = dummyYourFavouriteItem[index].name,
                        onItemClick = {}
                    )
                }
                Text(
                    text = "Everything for Love",
                    modifier = Modifier.padding(
                        bottom = dimensionResource(id = R.dimen.eight_dp),
                        top = dimensionResource(id = R.dimen.eighteen_dp),
                        start = dimensionResource(R.dimen.twenty_two_dp),
                    ),
                    style = TextStyle(
                        fontSize = fontDimensionResource(id = R.dimen.twenty_two_dp),
                        color = Black,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Poppins
                    )
                )
                LazyVerticalGrid(
                    cells = GridCells.Fixed(2),
                    contentPadding = PaddingValues(
                        start = dimensionResource(R.dimen.twenty_two_dp),
                        end = dimensionResource(R.dimen.eight_dp),
                        //top = dimensionResource(R.dimen.twenty_two_dp),
                        bottom = dimensionResource(R.dimen.twenty_two_dp),
                    ),
                    modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.ten_dp)),
                    content = {
                        items(count = dummyQuickOrder.size) { index ->
                            EverythingYouLoveCard(
                                painter = dummyQuickOrder[index].icon,
                                title = dummyQuickOrder[index].title,
                                kind = dummyQuickOrder[index].kind
                            )
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyRowLazyVerticalGridSampleTheme {
        Greeting("Android")
    }
}