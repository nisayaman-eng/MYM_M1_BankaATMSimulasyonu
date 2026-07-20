package ders6

fun main() {
    val hamGirdi = " mERhaBa Kotlin "
    println("Ham girdi $hamGirdi")

    val temizGirdi = hamGirdi.trim().lowercase()
    println("Temiz girdi: $temizGirdi")

    if (hamGirdi == "merhaba kotlin"){
        println("Doğru")
    }

    if (temizGirdi.contains("kot")){
        println("İçeriyor")
    }

    println(temizGirdi.substring(8))
    println(temizGirdi.split(" ")[0]) // 0. indexi verdi

    print("Adın: ")
    val ad = readln().trim().lowercase()
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase() }

    println(temizlenmisAd)

    //val bosluk = "   "
    //println(bosluk.isEmpty())
}