package com.example.poo

class Carro (var cor: String?, val motor: MotorImpl) : Motor by motor {

    fun drive() {
        when {
            !motor.status() -> println("Ligue o carro!")
            !motor.autonomy() -> {
                when (motor) {
                    is MotorEletrico -> println("Recarregue o motor!")
                    is MotorGasolina -> println("Coloque combustível!")
                }
                off()
            }
            else -> {
                motor.wasting()
                when (motor) {
                    is MotorEletrico -> println("Carro andando...")
                    is MotorGasolina -> println("Vrum vrum!")
                }
            }
        }
    }

    fun honk() {
        println("Bip bip!")
    }
}