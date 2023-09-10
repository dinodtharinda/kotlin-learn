package com.example.oopdemo

import android.util.Log

class Car {
    var maxSpeed = 30

    fun start() {
        Log.i("MyTag", "Car is Starting...")
        Log.i("MyTag", "maximum speed is $maxSpeed")
    }
}