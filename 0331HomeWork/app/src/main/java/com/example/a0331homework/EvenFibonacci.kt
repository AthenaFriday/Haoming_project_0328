package com.example.a0331homework

fun main() {
    println(findEvenFibonacci(34))
}

fun findEvenFibonacci(max: Int): List<Int> {
    var firstNum = 0
    var secondNum = 1
    var result = mutableListOf<Int>()

    while (!((firstNum + secondNum) > max)) {
        var sum = firstNum + secondNum
        firstNum = secondNum
        secondNum = sum
        if ((sum % 2) == 0) result.add(sum)
    }

    return result
}