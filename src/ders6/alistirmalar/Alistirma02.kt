package ders6.alistirmalar

fun main() {
    //0 – 99.99 TL arası -> Kargo 30 TL
    //100.0 – 299.99 TL arası -> Kargo 15 TL
    //300.0 TL ve üzeri -> Kargo Bedava!
    //Sıfırın altındaki negatif değerler için uyarı verin.

    print("Lütfen toplam sepet tutarınızı giriniz: ")
    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null){

        when (sepetTutari) {
            in 0.00..99.99 -> {
                val kargoUcreti = 30.00
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }
            in 100.0..299.99 -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }
            in 300.0..Double.MAX_VALUE -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }else -> println("Sepet tutarı negatif bir değer olamaz!")

        }

    }else {
        println("Lütfen geçerli bir sayısal tutar giriniz!")
    }





}