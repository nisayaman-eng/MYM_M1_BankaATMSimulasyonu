package ders8.alistirmalar

fun main() {


   do{
        var rastgeleSayi = (1..6).random()

        if (rastgeleSayi == 6) {
            println("Şanslı altılı geldi, oyun bitiyor.")
            break
        }else {
            println("Zar $rastgeleSayi geldi tekrar atılıyor...")

        }

    }while (true)

//Benim çözümüm ama yukarıdaki daha doğru gibi zaten 6 nın dışına çıkılmayacak o yüzde fora gerek yok

    // for (i in 1..6) {
    //     var zar = (1..6).random()
//
    //     if (zar == 6) {
    //         break
    //     } else {
    //         println("Zar $zar geldi tekrar atılıyor...")
    //     }
    // }
//
    // println("Şanslı altılı geldi, oyun bitiyor.")
}