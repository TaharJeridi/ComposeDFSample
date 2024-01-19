package it.tjeridi.composedfsample

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

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