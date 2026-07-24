package ders7.alistirmalar

fun main() {
//1’den 5’e kadar dönen bir for döngüsü kurun (Kullanıcıya 5 mesaj atma hakkı veriyoruz).
//Döngünün her adımında kullanıcıdan readln() ile bir mesaj girmesini isteyin.
//Girilen metni, karar mekanizmasına sokmadan önce boşluklarından arındırın (trim) ve tamamen küçük harfe (lowercase) çevirin.
//Eğer temizlenmiş metnin içinde “bedava”, “kazandınız” veya “kampanya” kelimelerinden herhangi biri geçiyorsa (contains veya == kullanarak) ekrana “Spam mesaj engellendi!” yazdırın.
//Geçmiyorsa “Mesaj gönderildi: [Temizlenen Mesaj]” yazdırın.


    for (i in 1..5){
        print("$i. mesajı girin: ")
        var kullaniciMetin = readln().trim().lowercase()

        if (kullaniciMetin.contains("kampanya") ||
            kullaniciMetin.contains("bedava") ||
            kullaniciMetin.contains("kazandınız")){

            println("Spam mesaj engellendi.")
        }else{
            println("Temizlenen mesaj: $kullaniciMetin")
        }



    }






}