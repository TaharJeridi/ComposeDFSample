package it.tjeridi.composedfsample.main.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import it.tjeridi.composedfsample.data.BottomNavItem
import it.tjeridi.composedfsample.widget.DFBottomNavBar
import it.tjeridi.composedfsample.widget.DFNavHost


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { DFBottomNavBar(navController) }) {
        DFNavHost(navController, BottomNavItem.DfFirst.route,it)
    }
}