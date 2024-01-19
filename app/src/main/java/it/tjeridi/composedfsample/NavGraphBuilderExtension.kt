package it.tjeridi.composedfsample

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.dfFirst(paddingValues: PaddingValues) {
    composable(route = Screens.DFFirst.route) {
        DFFirst(paddingValues = paddingValues)
    }
}

fun NavGraphBuilder.dfSecond(paddingValues: PaddingValues) {
    composable(route = Screens.DFSecond.route) {
        DFSecondScreen(paddingValues = paddingValues)
    }
}

fun NavGraphBuilder.dfThird(paddingValues: PaddingValues) {
    composable(route = Screens.DFThird.route) {
        DFThirdScreen(paddingValues = paddingValues)
    }
}