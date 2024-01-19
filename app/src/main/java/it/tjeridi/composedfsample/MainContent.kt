package it.tjeridi.composedfsample

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { DFBottomNavBar(navController) }) {
        DFNavHost(navController,BottomNavItem.DfFirst.route,it)
    }
}