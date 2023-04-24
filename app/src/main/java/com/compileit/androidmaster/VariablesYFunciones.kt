package com.compileit.androidmaster

val age: Int = 50

/**
 * Variables
 */
fun main() {
    showMyAge(30)
    add(50,10)
    val miResta = restar(20, 10)
    val miResta2 = restar2(45, 10)
    println(miResta)
    println(miResta2)
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun restar(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun restar2(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber

fun variablesAlfanumericas() {
    /**
     * Variables Alfanuméricas
     */
    //char
    val charExample: Char = 'H'

    // String
    val stringExample: String = "JP"
}

fun variablesBoolean() {
    /**
     * Variables Booleanas
     */
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
}

fun variablesNumericas() {
    /**
     * Variables Numéricas
     */

    // Int
    val enteroExample: Int = 30

    //Long
    val longExample: Long = 0

    //Float
    val floatExample: Float = 33.33f

    //Double
    val doubleExample: Double = 31.312333

}