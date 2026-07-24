package ders7.alistirmalar

fun main() {
 //Kullanıcıdan 1 ile 10 arasında bir sayı alın. Bu sayının çarpım tablosunu for döngüsü kullanarak ekrana yazdırın.
    //
    //Örnek Çıktı (Sayı 5 ise):
    //5 x 1 = 5
    //5 x 2 = 10
    //…
    //5 x 10 = 50

    print("1 ile 10 arasında bir sayı girin: ")
    val sayi = readln().toIntOrNull()

    if (sayi == null){
        println("Lütfen sadece rakam giriniz.")

    }else if (sayi !in 1..10){
        println("1 ile 10 arasında bir sayı girin.")
    } else {
        for (i in 1..10){
            val carpma = i * sayi
            println("$sayi * $i = $carpma")

        }
    }





}