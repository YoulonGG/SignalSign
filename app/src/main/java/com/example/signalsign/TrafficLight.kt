package com.example.signalsign

enum class TrafficLight(val id: Int,val sign: String, val description: String) {

    RED(1,"Stop", "Stop your vehicle!"),
    YELLOW(2,"Get Ready", "Start your engine!"),
    GREEN(3,"Go", "You can go now!");


}