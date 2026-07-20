package ders6.alistirmalar

fun main() {
    val ay = 12

    val mevsim = when (ay) {
        12, 1, 2 -> "Kış"
        3, 4, 5 -> "İlkbahar"
        6, 7, 8 -> "Yaz"
        9, 10, 11 -> "Sonbahar"
        else -> "Geçersiz mevsim"
    }

    println(mevsim)

}