package ders8

fun main() {

    dısDongu@ for (i in 1..3){
        println("Dış döngü değeri: $i")

        for (j in 1..3){
            println("İç döngü değeri: $j")
            if (i == 2 && j == 2){
                break@dısDongu
            }
        }

    }





}