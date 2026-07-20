package ders6.alistirmalar

//0 – 6 yaş arası -> “Ücretsiz Tarife: 0 TL”
//7 – 18 yaş arası -> “Öğrenci Tarifesi: 50 TL”
//19 – 64 yaş arası -> “Tam Tarife: 100 TL”
//65 ile 120 yaş arası -> “Emekli İndirimi: 40 TL”
//Bu sınırlar dışındaki tüm sayılar için geçersiz yaş uyarısı verin.

fun main() {

    print("Yaşınızı giriniz: ")
    val yas = readln().toIntOrNull()

    if (yas == null){
        println("Hata: Sadece tam sayı giriniz!")
        return
    }

    val biletFiyati = when (yas){
       in 0..6 -> "Ücretsiz Tarife: 0 TL"
       in 7..18 -> "Öğrenci Tarifesi: 50 TL"
       in 19..64 -> "Tam Tarife: 100 TL"
       in 65..120 -> "Emekli İndirimi: 40 TL"

        else -> "AYH! Size bedava BUYRUUUNN!"
    }

    println(biletFiyati)

}