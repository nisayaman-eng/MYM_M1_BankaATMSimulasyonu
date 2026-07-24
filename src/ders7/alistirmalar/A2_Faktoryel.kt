package ders7.alistirmalar

fun main() {
    //Kullanıcıdan pozitif bir tam sayı girmesini isteyin.
// Gelen veriyi güvenli bir şekilde tam sayıya çevirdikten sonra,
// bu sayının faktöriyel değerini hesaplayarak ekrana yazdırın.
// (Örneğin: 5! = 5 * 4 * 3 * 2 * 1 = 120 gibi.
// Kullanıcı 5 girdiğinde çıktı sadece “5! = 120” olmalıdır. Çarpım aşamalarını yan yana yazdırmanıza gerek yoktur.) //İpucu: Sonucu tutmak için döngü dışında var sonuc = 1 adında bir değişken tanımlayın.
// Ardından downTo kullanarak verilen sayıdan 1’e doğru geriye sayan bir döngü kurun ve her adımda sayacı sonuc ile çarparak (*=) güncelleyin.

    print("Lütfen pozitif bir tam sayı giriniz: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null && girdi > 0){
        var sonuc = 1

        for (i in girdi downTo sonuc){
        sonuc *=i
        }
        println("$girdi! = $sonuc")
    }else {
        println("Hata: Lütfen geçerli bir tam sayı girin!")
    }












}