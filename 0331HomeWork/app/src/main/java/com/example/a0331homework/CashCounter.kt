package com.example.a0331homework

fun main() {
    println("Please input purchase price and cash given seperated by semicolon(12.50;20.00): ")
    var input = readln().split(";")
    var purchasePrice: Double = input[0].toDouble()
    var cashGiven: Double = input[1].toDouble()

    if (purchasePrice > cashGiven) {
        println("ERROR")
        return
    } else if (purchasePrice == cashGiven) {
        println("ZERO")
        return
    }

    // currencies/bills that need to give back the customers as change
    var change: Double = cashGiven - purchasePrice
    val billList: MutableList<String> = mutableListOf()

    // map of the bills
    val bills: Map<Double, String> = mapOf(100.00 to "HUNDRED", 50.00 to "FIFTY", 20.00 to "TWENTY", 10.00 to "TEN", 5.00 to "FIVE", 2.00 to "TWO", 1.00 to "ONE", 0.50 to "HALF DOLLAR", 0.25 to "QUARTER", 0.10 to "DIME", 0.05 to "NICKEL", 0.01 to "PENNY")

    calculateBills(change, bills, billList)
    println(billList)

}

fun calculateBills(change: Double, bills: Map<Double, String>, billList: MutableList<String>) {
    if (change == 0.0) return
    for (bill in bills.keys) {
        if (bill <= change) {
            bills[bill]?.let { billList.add(it) }
            calculateBills(change - bill, bills, billList)
            break
        }

    }
}