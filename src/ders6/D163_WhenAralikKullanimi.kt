package ders6

fun main() {

    val sinavNotu = 85

    when (sinavNotu) {
        in 90..100 -> println("AA")
        in 80..89 -> println("BA")
        in 0..79 -> println("Geliştirilebilir")
        else -> println("Geçersiz not!")
    }



}