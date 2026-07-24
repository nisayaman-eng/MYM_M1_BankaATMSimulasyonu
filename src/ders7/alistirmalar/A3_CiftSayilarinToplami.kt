package ders7.alistirmalar

fun main() {
    //1’den 100’e kadar olan sayılar arasında (100 dahil) sadece çift sayıların toplamını bulan bir program yazın.


    var toplam = 0
    for (sayi in 2 .. 100 step 2) {
        toplam += sayi
    }

    println("1 ile 100 arasındaki çift sayıların toplamı: $toplam")
}




