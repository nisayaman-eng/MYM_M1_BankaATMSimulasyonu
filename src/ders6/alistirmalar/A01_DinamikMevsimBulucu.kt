package ders6.alistirmalar

fun main() {
    print("Lütfen 1 ile 12 arasında bir ay numarası girin: ")
    val ay = readln().toIntOrNull()

    if (ay != null){
        val mevsim = when (ay) {
            12, 1, 2 -> "Kış"
            3, 4, 5 -> "İlkbahar"
            6, 7, 8 -> "Yaz"
            9, 10, 11 -> "Sonbahar"
            else -> "Geçersiz mevsim"
        }
        println(mevsim)
    }else{
        print("Lütfen geçerli bir sayı giriniz.")
    }



}