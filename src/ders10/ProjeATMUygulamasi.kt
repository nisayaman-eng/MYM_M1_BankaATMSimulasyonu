package ders10
//Boşluk Testi: Şifreyi girerken bilerek ” 1234 ” şeklinde boşluk bırakarak yazın. Menüye girerken ” 2 ” şeklinde boşluklu basın. Sisteminizin bu hataları onarıp kabul ettiğini gözlemleyin.
//Bloke Testi: Şifreyi 3 kez yanlış girin ve sistemin sizi menüye almadan kapattığından emin olun.
//Geçersiz İşlem Testi: Ana menüde “5” veya “harf” girerek sistemin hata verip menüyü tekrar gösterdiğini test edin.
//Çökme (Crash) Testi: Para yatırma ekranında bilerek “abc” yazın. Null Safety kalkanınızın sizi koruduğunu ve sistemin çökmediğini doğrulayın.
//Mantık Testi: Hesabınızda 1000 TL varken 1500 TL çekmeye çalışın (“Yetersiz bakiye”). Ayrıca eksi (-500) değer yatırmaya çalışarak negatif sayıların engellendiğini test edin.
fun main() {

    val dogruSifre = "1234"
    var bakiye = 1000.0
    var hak = 3

    println("---KOTLİN BANKASINA HOŞGELDİNİZ---")

    DisDongu@while (hak > 0) {
        print("4 haneli şifrenizi girin: ")
        val girilenSifre = readln().trim()

        if (girilenSifre != dogruSifre) {
            hak--
            if (hak > 0) {
                println("Hatalı şifre! Tekrar deneyiniz. Kalan hakkınız: $hak")
            } else {
                println("Kartınız bloke edilmiştir!")
                break
            }

        } else {
            println("Giriş başarılı.\n")



            println("Hoşgeldiniz, seçiminizi yapın.")

            do {
                println(
                    """
                ---------------------------
                1. Bakiye Sorgulama💵💶💷💴
                2. Para Yatırma🤑🏦💰🤝
                3. Para Çekme💸💸💸
                4. Çıkış 👋👉
                ---------------------------
            """.trimIndent()
                )
                print("Seçiminiz: ")
                val secim = readln().trim()

                when (secim) {
                    "1" -> println("Bakiyeniz: $bakiye TL\n")
                    "2" -> {
                        print("Yatıralacak tutarı girin: ")
                        val tutar = readln().toDoubleOrNull() ?: 0.0

                        if (tutar <= 0.0) {
                            println("Geçersiz Tutar Girdiniz")
                        } else {
                            bakiye += tutar
                            println("Güncel bakiyeniz: $bakiye TL\n")
                        }

                    }

                    "3" -> {
                        print("Çekilecek tutarı girin: ")
                        val cekilecekTutar = readln().toDoubleOrNull() ?: 0.0

                        if (bakiye < cekilecekTutar) {
                            println("Yetersiz Bakiye")
                        } else if (cekilecekTutar <= 0.0) {
                            println("Geçersiz Tutar Girdiniz")
                        } else {
                            bakiye -= cekilecekTutar
                            println("Güncel bakiyeniz: $bakiye TL\n")
                        }
                    }

                    "4" -> {
                        println("İyi günler dileriz")
                        break@DisDongu
                    }

                    else -> println("Geçersiz seçim! Tekrar deneyin🤗.\n")
                }


            } while (true)

        }
    }


}