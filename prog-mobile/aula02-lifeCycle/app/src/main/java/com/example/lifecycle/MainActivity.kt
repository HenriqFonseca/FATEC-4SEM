package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        Log.v("lifeCycle", "Activity criada - onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.v("lifeCycle", "Activity iniciada - onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.v("lifeCycle", "Activity resumida - onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.v("lifeCycle", "Activity pausada - onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.v("lifeCycle", "Activity parada - onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("lifeCycle", "Activity destruida - onDestroy()")
    }

}