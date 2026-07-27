package ders8.alistirmalar

fun main() {


    do {
        println("""
            a. Bakiye Göster
            b. Para Çek
            c. Çıkış
            """.trimIndent())

        print("Lütfen seçiminiz yapın: ")
        var secim = readln()[0]

        when (secim){
            'a' -> println("Bakiye sorgulanıyor...")
            'b' -> println("Para çekiliyor")
            'c' -> {
                println("İyi günler dileriz")
                break
            }
            else -> println("Geçersiz işlem")
        }


    }while (true)





}