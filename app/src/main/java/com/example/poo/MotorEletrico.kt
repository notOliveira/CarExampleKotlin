package com.example.poo

class MotorEletrico (private var energy: Int = 2): MotorImpl() {

    override fun autonomy(): Boolean {
        return energy > 0
    }

    override fun wasting() {
        println("Gastando energia\nNível de energia: $energy")
        energy--
    }
}