package com.example.a0331homework

fun main() {
    val list = listOf(5, 1, 3)
    print(largestElements(list, 1))
}

fun largestElements(list: List<Int>, count: Int): List<Int> {
    var sortedList: List<Int> = list.sortedDescending()

    if (count < list.size) {
        return list.slice(0..(count - 1))
    } else {
        return sortedList
    }

}