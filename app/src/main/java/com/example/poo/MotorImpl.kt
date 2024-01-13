package com.example.poo

abstract class MotorImpl (private var ligado: Boolean = false) : Motor {
    override fun on() {
        ligado = true
    }

    override fun off() {
        ligado = false
    }

    fun status(): Boolean {
        return ligado
    }

    abstract fun autonomy(): Boolean

    abstract fun wasting()

}