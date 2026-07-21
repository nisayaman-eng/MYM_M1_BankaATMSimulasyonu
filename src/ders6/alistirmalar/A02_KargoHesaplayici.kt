package ders6.alistirmalar

fun main() {
    print("Sepetinizdeki toplam tutarı ondalıklı olarak giriniz: ")
    val sepetTutari= readln().toDoubleOrNull()

    if (sepetTutari == null) {
        println("Lütfen tekrardan giriş yapınız!")
        return
    }

    when (sepetTutari) {
        in 0.00..99.99 -> println("Kargo 30 TL, Toplam Tutar: ${sepetTutari + 30}")
        in 100.0..299.99 -> println("Kargo 15 TL, Toplam Tutar: ${sepetTutari + 15}")
        else ->
            if (sepetTutari < 0){
            println("Yanlış tutar girişi")
        }else{
            println("Kargo Bedava, Toplam Tutar: Toplam Tutar: $sepetTutari")
        }

    }


}