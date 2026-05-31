package com.scheduling.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchedulingAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SchedulingApp()
                }
            }
        }
    }
}

@Composable
fun SchedulingApp() {
    Text("تطبيق الجدولة الذكي")
}

@Preview(showBackground = true)
@Composable
fun SchedulingAppPreview() {
    SchedulingAppTheme {
        SchedulingApp()
    }
}

@Composable
fun SchedulingAppTheme(content: @Composable () -> Unit) {
    MaterialTheme {
        content()
    }
}
