package com.krsna.kotlinbasics.functions



fun main(){

    operator fun Int.times(string : String) = string.repeat(this)
    println(2 * "Oh Krsna")

    operator fun String.get(n : IntRange) = substring(n)
    val str = "Oh Krsna, this is nice doing and its beautiful, Thank you"
    println(str[1..17])

}