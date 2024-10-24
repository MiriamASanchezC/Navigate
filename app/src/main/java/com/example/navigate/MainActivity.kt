package com.example.navigate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.navigate.navigation.NavManager // Asegúrate de importar NavManager
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigate.views.HomeView // Importa HomeView o cualquier composable que quieras previsualizar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavManager() // Llama a NavManager para gestionar la navegación
        }
    }
}
