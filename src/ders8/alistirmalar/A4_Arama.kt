package ders8.alistirmalar

fun main() {
    SinifDongusu@ for (sinif in 1..5) {
        for (ogrenci in 1..10) {
            if (sinif == 3 && ogrenci == 5) {
                println("$sinif. Sınıf, $ogrenci. Öğrenci")
                println("Aranan öğrenci bulundu!")
                break@SinifDongusu
            }

        }
    }


}