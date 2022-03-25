package academy.learnprogramming.kotlinpractice

import java.math.BigDecimal

fun dataTypes() {
    val myInt = 10
    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val char = 'b'
    val myCharInt = 65

    println(myCharInt.toChar())

    val myBoolean: Boolean = true

    val names = arrayOf("John", "Jane")

    val longs1 = arrayOf<Long>(1, 2, 3)

    val evenNumbers = Array(16) { i -> i * 2 }//Array Constructor

    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(10000) { i -> i + 1 } //Initailize an array to 100,000

    val allZeroes = Array(100) { 0 } //All Zeros!

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10 }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'D')

    for (element in mixedArray) {

    }

    intArrayOf() // To map to the primitive array


    var someOtherArray = intArrayOf(5) // You can intialize with all zeroes here
    // .toIntArray() // to convert to Int array


}