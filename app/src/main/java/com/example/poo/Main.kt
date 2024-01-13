package com.example.poo



fun main() {

//    Motor elétrico
    val motorEletrico = MotorEletrico()
    val tesla = Carro("Branco", motorEletrico)
    tesla.drive()
    tesla.on()
    tesla.drive()
    tesla.off()
    tesla.drive()
    tesla.on()
    tesla.drive()
    tesla.drive()
    tesla.drive()
    tesla.honk()

    println("\n\n\n")
//    Motor de gasolina

    val motorGas = MotorGasolina()
    val car = Carro("Black", motorGas)
    car.drive()
    car.on()
    car.drive()
    car.off()
    car.drive()
    car.on()
    car.drive()
    car.drive()
    car.drive()
    car.honk()

}

