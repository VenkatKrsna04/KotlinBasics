package com.krsna.kotlinbasics.functions


fun printMessage(string : String): Unit{

    println(string)

}

fun printMessageWithPrefix(message : String, prefix:String = "Gaura"){
    println("[$prefix] $message")
}


fun sum(a : Int, b : Int): Int{
    return a+b;
}

fun multiple(a: Int, b: Int) = a*b


    fun main(){
        printMessage("Hare Krsna, First program")
        printMessageWithPrefix("Hare Krsna", "This is prefix")
        printMessageWithPrefix(prefix = "Oh Krsna", message = "Gauranga")
        printMessageWithPrefix("Hare Krsna")
        println( sum(4,9))
        println(multiple(4,6))
    }
