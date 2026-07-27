package ders8.alistirmalar

fun main() {
    val dogruSifre = "1234"
    var kullaniciSifre: String

    do{
        print("Lütfen şifrenizi girin: ")
        kullaniciSifre = readln()
    }while (kullaniciSifre != dogruSifre)

    println("Giriş başarılı")


}