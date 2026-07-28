package ders9

fun main() {
    var kullaniciAdi: String? = null

    var gosterilecekIsim = kullaniciAdi ?: "Misafir"
    println("Merhaba, $gosterilecekIsim")

    //Elvis operatörünün açılımıdır.
    if (gosterilecekIsim != null) {
        println("Merhaba, $gosterilecekIsim")
    } else {
        println("Merhaba, Misafir")
    }

    //İkinci örnek

    var mesaj: String? = null
    var uzunluk = mesaj?.length ?: 0

    println("Mesajın uzunluğu: $uzunluk")

    //üçüncü örnek

    print("Yaşınızı girin: ")
    var yas = readln().toIntOrNull() ?: "sadece rakamları kullanarak yaşınızı yazınız"
    println("Yaşınız: $yas")

}