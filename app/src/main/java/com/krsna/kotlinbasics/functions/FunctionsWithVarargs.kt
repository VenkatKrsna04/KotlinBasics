package com.krsna.kotlinbasics.functions


fun printStrings(vararg name: String){

    for (n in name) println(n)


}

fun printStringsWithprefix(vararg name: String, prefix : String){

    for (n in name) println(prefix + n )

}

fun printAllStrings(vararg names : String){
    printStrings(*names)
}

fun main(){

    printStrings("Hare Krsna", "Hare Krsna", "Krsna Krsna","Hare Hare",
        "Hare Rama", "Hare Rama", "Rama Rama", "Hare Hare")

    println("")

    printStringsWithprefix("Krsna", "Krsna", "Krsna Krsna","Hare",
        "Rama", "Rama", "Rama Rama", "Hare", prefix = "Hare")


    printAllStrings("Hare Krsna", "Hare Krsna", "Krsna Krsna","Hare Hare")

}
