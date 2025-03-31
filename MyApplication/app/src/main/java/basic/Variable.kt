package com.example.mykotlinlearning.advance

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) return 1

    return (n * (factorial(n - 1)))
}

fun main() {
    print(factorial(0))
}