package ders9.alistirmalar

fun main() {
    //Veritabanından kullanıcının hesabındaki indirim kuponunun değeri geliyor.
// Bunu val kuponTutari: Double? = null olarak temsil edin.
// Kullanıcının sepet tutarı 500.0 olsun.
// Kupon tutarını (null ise 0.0 kabul edilecek şekilde)
// sepet tutarından çıkarıp güncel ödenecek miktarı hesaplayan
// ve yazdıran tek satırlık bir aritmetik işlem kodu yazın.

    val kuponTutar: Double? = null
    val sepetTutar = 500.0

    println("İndirimli sepet tutarı: ${sepetTutar - (kuponTutar ?: 0.0)}")

}