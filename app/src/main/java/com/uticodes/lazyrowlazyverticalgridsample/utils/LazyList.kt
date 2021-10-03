package com.uticodes.lazyrowlazyverticalgridsample.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowList(
    modifier: Modifier = Modifier,
    onItemSelect: (Int) -> Unit,
    count: Int,
    verticalPadding: Dp = 0.dp,
    item: @Composable (Int) -> Unit,
) {
    RowListLayout(
        modifier = modifier,
    ) {
        for (i in 0 until count) {
            item {
                ItemLayout(
                    modifier =
                    Modifier.padding(bottom = verticalPadding)
                        .clickable {
                            onItemSelect(i)
                        },
                ) {
                    item(i)
                }
            }
        }
    }
}

@Composable
fun ColumnListLayout(
    modifier: Modifier,
    content: LazyListScope.() -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        content()
    }
}

@Composable
fun RowListLayout(
    modifier: Modifier,
    content: LazyListScope.() -> Unit
) {
    LazyRow(
        modifier = modifier
    ) {
        content()
    }
}

@Composable
fun ItemLayout(modifier: Modifier, content: @Composable () -> Unit) {
    Column(modifier = modifier) {
        content()
    }
}