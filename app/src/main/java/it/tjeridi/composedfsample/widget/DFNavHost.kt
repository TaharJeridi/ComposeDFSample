package it.tjeridi.composedfsample.widget

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import it.tjeridi.composedfsample.utilities.dfFirst
import it.tjeridi.composedfsample.utilities.dfSecond
import it.tjeridi.composedfsample.utilities.dfThird

@Composable
fun DFNavHost(
    navController: NavHostController,
    startDestination: String,
    paddingValues: PaddingValues
){
    NavHost(navController, startDestination = startDestination) {
        dfFirst(paddingValues)
        dfSecond(paddingValues)
        dfThird(paddingValues)
    }
}