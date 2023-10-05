package com.krsna.kotlinbasics.functions



fun main(){


    infix fun Int.repeatWords(str:String) = str.repeat(this)
    println(4 repeatWords "Krsna ")

    var nama = "Hare" to "Krsna"
    println(nama)

    infix fun String.onto(others : String) = Pair(this,others)
    var names = "Hare" onto "Krsna"
    println(names)


    val hare = Persons("Hare")
    val krsna = Persons("Krsna")
    println(hare likes krsna)


}

class Persons(names : String){

    val likedPeoples = mutableListOf<Persons>()
    infix fun likes(persons : Persons) {
        likedPeoples.add(persons)
    }

}