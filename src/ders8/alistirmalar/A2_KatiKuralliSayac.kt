package ders8.alistirmalar

fun main() {
    for (i in 1..50) {

        if (i % 10 == 0) {// i nin 10 a bölümünden kalan 0 ise
            continue
        }
        println(i)
    }


}