package lesson3.datatypes

/**
 * Data Types in Kotlin:
 *
 * Note: Kotlin'de her şey bir objedir. Bundadn dolayı her değişkenin sonuna nokta işareti koyarak o değişkenin
 * sınıfına ait method ve property'leri çağırıp kullanabiliriz.
 * Note-2: Kotlin statik yazılmış bir dildir. Bunun anlamı şudur: Her değişkenin veri tipi, compiler time'da bilinmelidir.
 *
 * 1. Number Data Types: (1 byte = 8 bit)
 * Byte -> 1 byte
 * Short -> 2 byte
 * Int -> 4 byte
 * Long -> 8 byte
 * Float -> 4 byte
 * Double -> 8 byte
 *
 * 2. Char Data Type:
 * Char -> 2 byte
 * Char tipindeki değişkene değer atamak için tırnak işaretlerini kullanırız. ('')
 *
 * 3. String Data Type:
 * String tipindeki değişkenlere değer atamak için çift tırnak ya da üçlü tırnak işaretini kullanırız. (" " veya """ """)
 * Bu iki ifade arasındaki fark main function içinde anlatıldı.
 *
 * 4. Boolean
 * Boolean -> 1 Bit
 * True ya da false değer alır.
 *
 * 5. Data Conversion:
 * Kotlinde tip dönüşümleri yapabilmek için aşağıdaki methodları kullanırız:
 * toByte()
 * toShort()
 * toInt()
 * toLong()
 * toFloat()
 * toDouble()
 * toChar()
 */

fun main(args: Array<String>) {

    val a: Byte = 100
    val b: Short = 200
    val c: Int = 300
    val d: Long = 400
    val e: Float = 500.0F
    val f: Double = 600.0

    println("Byte value is: $a")
    println("Short value is: $b")
    println("Int value is: $c")
    println("Long value is: $d")
    println("Float value is: $e")
    println("Double value is: $f")

    println("========================")

    val myChar: Char = 'A'
    println("Char value is: $myChar")

    println("========================")

    // Kaçış karakteri -> /
    println('\n') // moves to the next line
    println('\$') // prints $
    println('\\') // prints \

    // String
    val myString1 = "Hello! " +
            "I am a string value!" +
            "How are you?"

    println(myString1)

    val myString2 = """Hello!
        I am a string value!
        How are you?"""

    println(myString2)

    println("========================")

    // Boolean
    val myBoolean:Boolean = true

    println("MyBoolean: $myBoolean")

    println("========================")

    // Type Conversion
    val myInt1 = 10
    // val myLong: Long = myInt // Bu atama yapılamaz. Çünkü Kotlin'de doğrudan bir tip dönüşü gerçekleştirilmez.

    val myLong: Long = myInt1.toLong()
    val myInt2: Int = myLong.toInt()

    println("MyInt1: $myInt1")
    println("MyLong: $myLong")
    println("MyInt2: $myInt2")

    println("========================")

    // Byte tipindeki bir değişken en fazla 127 değerini tutabilir. Biz bu değişkene 200 değerini atarsak taşma olur.
    // Hata almayız ancak bu değişken değerini ekrana yazdırdığımızda saçma bir değer çıktısı görürüz.
    val number1: Int = 200
    val number2: Byte = number1.toByte()
    println(number2)

}