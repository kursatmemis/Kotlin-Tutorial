package lesson5.booleans

/**
 * Boolean:
 * True ya da false gibi bir karar almamızı/vermemizi gerektiren durumlar için Boolean kullanırız.
 */

fun main(args: Array<String>) {

    // Create Boolean Variables

    val isSummer: Boolean = true
    val isCold: Boolean = false

    println("Is Summer?: $isSummer")
    println("Is Cold?: $isCold")

    // Logical Operators

    var x: Boolean = true
    var y:Boolean = false

    println("x && y = " +  (x && y))
    println("x || y = " +  (x || y))
    println("!y = " +  (!y))

    // and() / or() Functions:

    /**
     * Not: and() / or() functionları ve && / || operatorleri arasındaki fark şudur:
     *
     * && (ve) ve || (veya) gibi operatörler, ifade içindeki tüm koşulların değerlendirilmesine gerek olmadan
     * sonuca ulaşabilirler. Eğer && operatörü birinci koşulu false olarak değerlendirirse,
     * ikinci koşulu değerlendirmeye gerek duymadan ifadeyi false olarak sonlandırabilir.
     * Benzer şekilde, || operatörü birinci koşulu true olarak değerlendirirse, ikinci koşulu değerlendirmeye
     * gerek duymadan ifadeyi true olarak sonlandırabilir.
     * Kotlin'in and() ve or() Fonksiyonları:
     *
     * and() / or() fonksiyonları ise operatörlerden farklı olarak her zaman her iki koşulu da değerlendirir.
     * Yani, kısa devre değerlendirme yapmazlar. İlk koşulun sonucuna bakılmaksızın her iki koşulu da değerlendirirler.
     */

    val a: Boolean = true
    val b: Boolean = false
    val c: Boolean = true

    println("a.and(b) = " +  a.and(b)) // false
    println("a.or(b) = " +  a.or(b)) // true
    println("a.and(c) = " +  a.and(c)) // true

    false && true.myExtensionFunction() // fonksiyon çalışmaz. çünkü kısa devre değerlendirmesi YAPIYOR.
    false.and(true.myExtensionFunction()) // fonksiyon çalışır. çünkü kısa devre değerlendirmesi YAPMIYOR.

    // Kotlin also provides not() and xor() functions to perform Logical NOT and XOR operations.

    val first = true
    val second = false

    println("The reverse of the first: ${first.not()}")
    println("The reverse of the second: ${second.not()}")
    println("xor operation between first and second: ${first.xor(second)}")

}

fun Boolean.myExtensionFunction(): Boolean {
    println("My Extension Function is running!")
    return true
}
