package ders6

fun main() {
    val kullaniciAdi = "admin"
    val sifre = "1234"

// Parametresiz when! (Öncelik sırasına göre doğrulamaları yukarıdan aşağıya süzüyoruz)
    when {
        kullaniciAdi == "" -> println("Hata: Kullanıcı adı alanı boş bırakılamaz!")
            sifre == "" -> println("Hata: Şifre alanı boş bırakılamaz!")
            kullaniciAdi == "admin" && sifre == "1234" -> println("Giriş başarılı, panele yönlendiriliyorsunuz.")
            else -> println("Hata: Kullanıcı adı veya şifre yanlış!")
    }
}