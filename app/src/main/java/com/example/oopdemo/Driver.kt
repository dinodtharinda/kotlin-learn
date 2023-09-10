package com.example.oopdemo

import android.util.Log

class Driver(var name: String,credit:Int) {
    var totalCredit =50

    val car = Car()
    var driverName = name

    init {
        totalCredit += credit
        car.maxSpeed = 150
        car.start()
    }


    fun showDetails() {
        Log.i("MyTag", "name of the driver is $driverName, Total Credits $totalCredit")
    }
}