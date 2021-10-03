package com.uticodes.lazyrowlazyverticalgridsample.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.uticodes.lazyrowlazyverticalgridsample.R
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.Poppins
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.White
import com.uticodes.lazyrowlazyverticalgridsample.utils.fontDimensionResource

@Composable
fun YourFavourites(icon: Int, items: String, onItemClick: () -> Unit) {

    Card(
        modifier = Modifier
            .padding(
                end = dimensionResource(R.dimen.fourteen_dp),
                bottom = dimensionResource(id = R.dimen.ten_dp)
            )
            .size(
                width = dimensionResource(id = R.dimen._200_dp),
                height = dimensionResource(id = R.dimen._100_dp)
            )
            .clickable(onClick = onItemClick),
        elevation = dimensionResource(id = R.dimen.zero),
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(icon),
                contentDescription = stringResource(id = R.string.an_icon),
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center),
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = stringResource(id = R.string._4_15),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(
                        end = dimensionResource(id = R.dimen.twenty_dp),
                        bottom = dimensionResource(id = R.dimen.eight_dp)
                    ),
                style = TextStyle(
                    fontSize = fontDimensionResource(id = R.dimen.twelve_dp),
                    color = White,
                    fontWeight = FontWeight.Light,
                    fontFamily = Poppins
                )
            )
            Text(
                text = items,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(
                        start = dimensionResource(id = R.dimen.sixteen_dp),
                        bottom = dimensionResource(id = R.dimen.fourteen_dp),
                        top = dimensionResource(id = R.dimen.fourteen_dp)
                    ),
                style = TextStyle(
                    fontSize = fontDimensionResource(id = R.dimen.twelve_dp),
                    color = White,
                    fontWeight = FontWeight.Light,
                    fontFamily = Poppins
                )
            )
        }
    }
}