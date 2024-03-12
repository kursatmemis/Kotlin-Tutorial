package lesson2.variables

/**
 * Variable - Değişken Nedir?
 * Değişkenler, bizim bilgisayardaki bellek konumlarına verdiğimiz isimlerdir.
 * Değişkenler ile bir bilgisayar programında veri depolayabilir ve bu verileri kullanabiliriz.
 *
 * Variable - Değişken Oluşturma:
 * 1. 'var' Keyword:
 * Mutable bir variable oluşturmayı sağlar. var keyword'ü kullanılarak oluşturulan değişkenlerin değerleri
 * sonradan değiştirilebilir.
 *
 * 2. 'val' Keyword:
 * Read-only bir değişken oluşturmayı sağlar. val keyword'ü ile oluşturulan değişkene sadece bir kere değer
 * atanır ve bu değer bir daha değiştirilemez.
 *
 * Variable - Değişken Tipi Belirlenmesi:
 * Kotlin'de değişken tanımlanırken Java'daki gibi bir tip belirleme zorunluluğumuz yoktur.
 * Kotlin, bizim değişkene atadığımız değere göre o değişkenin tipini kendisi belirleyebilecek kadar akıllıdır.
 *
 * Variable - Değşiken İsimlendirme Kuralı:
 * Kotlin'de tanımlanan değişkenler harf, rakam, altçizgi ve dolar işareti barındırabilir.
 * Kotlin'de tanımlanan değişkenler, ya bir harf ile ya da altçizgi ile başlamak zorundadır.
 * Kotlin'de tanımlanan değişkenler, büyük-küçük harfe duyarlıdır. Örneğin name ve NAME değişkenleri farklıdır.
 * Kotlin'de tanımlanan değişkenler, boşluk ve özel karakterler içeremez. (?, :, <, >, vb.)
 * Kotlin'de tanımlanan değişkenler, 'var', 'val', 'String' gibi reserve kelimeler içeremezler.
 */

fun main(args: Array<String>) {

    // var keyword
    var name = "First Name"
    println("First Name: " + name)
    name = "Second Name"
    println("Second Name: $name")

    // val keyword
    val surname = "First Surname"
    // val ile tanımlanan değişkene 2. kez bir değer atanamaz.
    // surname = "Second Surname" // Hata verir.

    println("--------------------------------------------------------")

    val number1 = 10
    println("is Int? ${number1 is Int}")

    val number2: Long = 10
    println("is Long? ${number2 is Long}")

}