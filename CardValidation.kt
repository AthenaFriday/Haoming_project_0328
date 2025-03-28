/*
* Banks
* - list of banks -
* ACME 1121
* ALFA 1111
* AMEX 3796
*
* Sample input
*
* First input -> 1121-0000-0000-0312
* Second input -> 03/12
*
* -> First 4 digit represent company
* -> Last 4 digit represent expiry date
*
*   Assuming card and date as input write a function to verify valid card numbers
* */

fun main() {
    val bankCodes = mutableListOf("1121", "1111", "3796")

    println("Please enter your card number as the following format 1121-0000-0000-0312: ")
    val first_input = readln()

    // validate fist_input
    if (first_input.length != 19) {
        println("Sorry, wrong card number.")
        return
    }

    print("Please enter your card expiry date as the following format 03/12: ")
    val second_input = readln()

    // validate second_input
    if (second_input.length != 5) {
        println("Sorry, wrong expiry date.")
        return
    }

    val fist_four_digits = first_input.substring(0, 4)
    val last_four_digits = first_input.substring(15, 19)
    val second_input_month = second_input.substring(0,2)
    val second_input_year =  second_input.substring(3,5)

    // validate first_four_digits exists in bankCodes
    if (!(fist_four_digits in bankCodes)) {
        println("Sorry, wrong card number.")
        return
    }

    // check the last_four_digits match the manually entered expiry date
    if (last_four_digits != (second_input_month + second_input_year)) {
        println("Sorry, expiration date does not match. ")
    }

    println("Verification succeeded.")
}