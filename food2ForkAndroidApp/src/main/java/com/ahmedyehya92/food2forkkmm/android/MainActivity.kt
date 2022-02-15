package com.ahmedyehya92.food2forkkmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmedyehya92.food2forkkmm.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import com.ahmedyehya92.food2forkkmm.android.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}
