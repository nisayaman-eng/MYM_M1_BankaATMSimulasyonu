package ders6.alistirmalar

fun main() {
//Eğer veri String ise: “Metin uzunluğu: [uzunluk]” yazdırın.
//Eğer veri Int ise: “Sayının 10 katı: [sonuç]” hesaplayıp yazdırın.
//Eğer veri Boolean ise: “Durum: Doğru” veya “Durum: Yanlış” yazdırın.
//Diğer tipler için: “Desteklenmeyen veri tipi” yazdırın.

    val gelenVeri: Any = 45.3

    when (gelenVeri) {
        is String -> {
            println("Metin uzunluğu: ${gelenVeri.length}")
        }

        is Int -> {
            println("Sayının 10 katı: ${gelenVeri * 10}")
        }

        is Boolean -> {
            val durumMesaji = if (gelenVeri) "Doğru" else "Yanlış"
            println("Durum: $durumMesaji")
            //if (gelenVeri) {
            //    println("Durum: Doğru")
            //} else {
            //    println("Durum: Yanlış")
            //}
        }

        else -> println("Desteklenmeyen veri tipi.")

    }


}