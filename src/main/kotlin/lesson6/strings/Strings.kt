package lesson6.strings

/**
 * String:
 * String bir değer ya iki tırnak (") ya da altı tırnak (""") ile çevirli olmalı.
 * "" ile belirtilen String'lere -> Escaped String,
 * """ ile belirtilen String'lere -> Raw String denir.
 * Raw String'ler, \n, \t gibi ifadeler içeremez.
 */

fun main(args: Array<String>) {

    // Escape - Raw String
    val escapeString = "I am an escape String \n"
    val rawString = """"I am an raw String" +
"And this is the second line." +
            "And this is the third line."""

    println(escapeString)
    println(rawString)

    println("==================================")

    // String as a char array

    val name = "Kursat"
    println(name[0])
    println(name[1])
    println(name[2])

    println("==================================")

    /** String Methods */
    // 1. length = String'in uzunluğunu return eder.
    // count methoduda length ile aynı işlevi görür.

    val myString = "Hello!"
    println("Length: ${myString.length}") // 6
    println("Length: ${myString.count()}") // 6

    // 2. lastIndex = String'in son karakterinin indexini return eder. Eğer string empty ise -> -1 return eder.

    println("The last index of the String: ${myString.lastIndex}")

    // 3. toUpperCase/toLowerCase: String'in her karakterini büyük/küçük harfe çevirirler.

    println(myString.uppercase())
    println(myString.lowercase())

    // 4. plus() method and + operator: String'leri birleştirmeye yarar.

    val str1 = "Muhammet"
    val str2 = "Kursat"
    val str3 = "Memis"

    val fullName = str1 + str2.plus(str3)

    println("The fullName: $fullName")

    // 5. drop/dropLast: String'deki ilk birkaç veya son birkaç karakteri kaldırırlar.

    val myName = "Kursat"

    println("Remove first 2 char from the name: ${myName.drop(2)}")
    println("Remove last 2 char from the name: ${myName.dropLast(2)}")

    // Not: Bir String içinde tırnak işareti kullanmak istiyorsan ' kullan.

    println("This's a String.")

    // indexOf(): Parametre olarak aldığı metin String içinde geçiyorsa başladığı indexi verir.

    val chars = "abcdef"
    println(chars.indexOf("def"))
    println(chars.indexOf("deff")) // geçimiyorsa -1 return eder.

    // compareTo: İki String'i alfabetik olarak kıyaslar.
    // Eşit iseler -> 0
    // Methodu çağıran obje alfabetik olarak daha az öncelikli ise-> pozitif bir sayı
    // Methodu çağıran obje alfabetik olarak daha öncelikli ise -> negative bir sayı return eder.

    val personName1 = "Ali"
    val personName2 = "Ali"
    val personName3 = "Mehmet"

    println(personName1.compareTo(personName2))
    println(personName1.compareTo(personName3))

    // getOrNull(): Belirtilen index'deki elamanı return eder. Eğer index sınırlar dışındaysa null return eder.

    val str = "abc"
    println(str.getOrNull(0))
    println(str.getOrNull(3))
}