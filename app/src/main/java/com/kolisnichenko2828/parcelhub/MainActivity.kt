package com.kolisnichenko2828.parcelhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kolisnichenko2828.parcelhub.presentation.navigation.ProfilesApp
import com.kolisnichenko2828.parcelhub.presentation.theme.ParcelHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParcelHubTheme {
                ProfilesApp()
            }
        }
    }
}