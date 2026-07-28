package ders9

fun main() {
    //“Eğer değişken null değilse metodu çalıştır,
    // eğer null ise hiçbir şey yapma ve geriye doğrudan null döndür.”

    var ikinciIsim: String? = null
    //println(ikinciIsim?.length)

    //Güvenli çağrı operatörünün açılımıdır.
    if (ikinciIsim != null){
        println(ikinciIsim.length)
    }else{
        println(null)
    }



}