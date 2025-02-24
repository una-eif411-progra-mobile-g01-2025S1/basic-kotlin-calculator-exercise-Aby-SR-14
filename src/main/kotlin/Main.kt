package org.example

import Calculator

fun main() {
    val calculator = Calculator()
    val sum = calculator.add(5.0, 3.0)      // Returns 8.0
    println("5.0 + 3.0 = $sum")
    val difference = calculator.subtract(10.0, 4.0)  // Returns 6.0
    println("10 - 4 = $difference")
    val product = calculator.multiply(2.0, 3.0)    // Returns 6.0
    println("2 * 3 = $product")
    val quotient = calculator.divide(10.0, 2.0)    // Returns 5.0
    println("10 / 2 = $quotient")
}