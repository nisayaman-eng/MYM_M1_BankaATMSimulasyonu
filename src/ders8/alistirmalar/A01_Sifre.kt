package ders8.alistirmalar

fun main() {
    val sifre = "1234"

    do {
        print("Lütfen şifrenizi girin: ")
        var kullaniciGirdi = readln()
    }while (sifre != kullaniciGirdi)

    println("Giriş başarılı")



}