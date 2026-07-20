package ders6

fun main() {
    val gizemliObje: Any = 5 //or "Bu bir String ifadedir."

    when (gizemliObje) {
        is String -> println("Bu bir String ifadedir. Uzunluğu ${gizemliObje.length}")
        is Int -> println("Bu bir tam sayıdır. Bu sayının karesi ${gizemliObje * gizemliObje}")
    }



}