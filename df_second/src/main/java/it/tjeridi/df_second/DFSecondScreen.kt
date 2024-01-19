package it.tjeridi.df_second

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
 * this class is used by reflection
 */


@Suppress("unused")
@Composable
fun DFSecondScreen(paddingValues: PaddingValues){
    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(paddingValues),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "df second screen",
            color = Color.White,
            modifier = Modifier.padding(all = 20.dp)
        )
    }
}