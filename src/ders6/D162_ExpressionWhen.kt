package ders6

fun main() {

    val biletSinifi = 'F'

    val sinifAciklamasi =
        when (biletSinifi) {
            'E' -> "Ekonomi Sınıfı"
            'B' -> "Business Class"
            'F' -> "First Class"
            else -> "Bilinmeyen Bilet Sınıfı!"
    }

    println(sinifAciklamasi)
}