package ders6.alistirmalar

import java.util.Locale
import java.util.Locale.getDefault

//Girilen komut tam olarak “merhaba” ise: “Size de merhaba!” yazdırın.
//Girilen komut tam olarak “saat kaç” ise: “Şu an saat 14:00” yazdırın.
//Eğer komutun içinde “hava” kelimesi geçiyorsa: “Dışarıda harika bir hava var.” yazdırın.
//Hiçbiri eşleşmezse: “Ne demek istediğinizi anlayamadım.” yazdırın.

fun main() {
    println("ChatBot' a hoşgeldiniz. Mesajınızı iletebilirsiniz.")
    val metin = readln().trim().lowercase()

    when {
        metin == "merhaba" -> {
            println("Size de merhaba!")
        }
        metin == "saat kaç" -> {
            println("Şu an saat 14:00")
        }
        metin.contains("hava") ->{
            println("Dışarıda harika bir hava var.")
        }
        else -> println("Ne demek istediğinizi anlayamadım.")


        //metin.contains("merhaba") -> {
        //    println("Size de merhaba!")
        //}
//
        //metin.contains("saat kaç") -> {
        //    println("Şu an saat 14:00")
        //}
//
        //metin.contains("hava") -> {
        //    println("Dışarıda harika bir hava var.")
        //}
        //else -> println("Ne demek istediğinizi anlayamadım.")
//
    }



}