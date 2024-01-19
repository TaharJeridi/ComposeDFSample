package it.tjeridi.composedfsample.utilities

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable

@Composable
fun DFFirst(paddingValues: PaddingValues) {
    DynamicFeatureUtils.dfFirstScreen(paddingValues)
}

@Composable
fun DFSecondScreen(paddingValues: PaddingValues) {
    DynamicFeatureUtils.dfSecondScreen(paddingValues)
}

@Composable
fun DFThirdScreen(paddingValues: PaddingValues) {
    DynamicFeatureUtils.dfThirdScreen(paddingValues)
}