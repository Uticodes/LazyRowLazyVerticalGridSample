package com.uticodes.lazyrowlazyverticalgridsample.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.uticodes.lazyrowlazyverticalgridsample.R
import com.uticodes.lazyrowlazyverticalgridsample.ui.theme.*
import com.uticodes.lazyrowlazyverticalgridsample.utils.Alpha02
import com.uticodes.lazyrowlazyverticalgridsample.utils.fontDimensionResource

@Composable
fun EverythingYouLoveCard(
    painter: Int,
    title : Int,
    kind: Int
){
    Card(
        modifier = Modifier.padding(
            end = dimensionResource(R.dimen.fourteen_dp),
            bottom = dimensionResource(id = R.dimen.ten_dp)
        )
            .size(
                width = dimensionResource(id = R.dimen._165_dp),
                height = dimensionResource(id = R.dimen._212_dp)
            )
            .clickable { },
        elevation = dimensionResource(id = R.dimen.eight_dp),
    ) {

        Column() {
            Box(
                modifier = Modifier
                    .background(color = Blue.copy(alpha = Alpha02),)
                    .fillMaxWidth()
                    .fillMaxHeight(.5f)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_loved),
                    contentDescription = stringResource(id = R.string.an_icon),
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(
                            top = dimensionResource(id = R.dimen.seven_dp),
                            end = dimensionResource(id = R.dimen.eight_dp),
                        )
                )
                Image(
                    painter = painterResource(painter),
                    contentDescription = stringResource(id = R.string.an_icon),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(dimensionResource(id = R.dimen._150_dp))
                )
            }
            Box(
                modifier = Modifier
                    .background(color = White,)
                    .fillMaxSize()
                    .padding(
                        start = dimensionResource(id = R.dimen.fourteen_dp),
                        end = dimensionResource(id = R.dimen.eight_dp),
                    )
            ) {
                Column {
                    Text(
                        text = stringResource(id = title),
                        color = Black,
                        modifier = Modifier.padding(top = dimensionResource(id = R.dimen.six_dp)),
                        style = MaterialTheme.typography.body1.copy(
                            fontSize = fontDimensionResource(id = R.dimen.eighteen_dp),
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = stringResource(id = kind),
                        modifier = Modifier.padding(
                            bottom = dimensionResource(id = R.dimen.sixteen_dp)
                        ),
                        style = TextStyle(
                            fontSize = fontDimensionResource(id = R.dimen.twelve_dp),
                            color = Black,
                            fontWeight = FontWeight.Light,
                            fontFamily = Poppins
                        )
                    )
                }
                Text(
                    text = stringResource(id = R.string._4_15),
                    color = BlueDeep,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(bottom = dimensionResource(id = R.dimen.ten_dp),),
                    style = MaterialTheme.typography.body1.copy(
                        fontSize = fontDimensionResource(id = R.dimen.eighteen_dp),
                        fontWeight = FontWeight.Bold
                    )
                )

                Image(
                    painter = painterResource(R.drawable.ic_add_to_cart),
                    contentDescription = stringResource(id = R.string.an_icon),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(
                            end = dimensionResource(id = R.dimen.eight_dp),
                            bottom = dimensionResource(id = R.dimen.ten_dp)
                        ),
                )
            }
        }
    }
}