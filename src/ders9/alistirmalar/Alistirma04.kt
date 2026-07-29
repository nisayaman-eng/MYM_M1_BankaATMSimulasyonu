package ders9.alistirmalar

fun main() {
    //Nullable bir değişkene null değeri atayın.
// Alt satırda Kesinlik Operatörü (!!) kullanarak
// bu değişkenin karakter sayısını (length) ekrana yazdırmayı deneyin.
// Kodu çalıştırıp derleyicinin
    // verdiği kırmızı NullPointerException (NPE) hatasını kendi gözlerinizle gözlemleyin.
// (Bu görev, size bu hatanın gerçek hayatta nasıl göründüğünü öğretmek içindir).

    val ad: String? = null
    println("Karakter sayısı: ${ad?.length}")






}