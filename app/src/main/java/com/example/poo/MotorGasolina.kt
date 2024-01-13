package com.example.poo

class MotorGasolina (private var gas: Int = 3) : MotorImpl() {
    override fun autonomy(): Boolean {
        return gas > 0
    }

    override fun wasting() {
        println("Gastando combustível\nNível de combustível: $gas")
        gas--
    }
}