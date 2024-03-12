package lesson7.arrays

/**
 * Arrays:
 * Array, aynı türden birden fazla öğeyi tek bir değişkende depolamak için kullanılır.
 */

fun main(args: Array<String>) {
    // Creating Arrays

    val fruits = arrayOf("Apple", "Banana", "Orange")
    println("fruits: ${fruits[0]}, ${fruits[1]}, ${fruits[2]}")

    // Alternatif olarak aşağıdaki gibi elmas işaretlerinin içinde tipide belirleyebiliriz.
    // val fruits = arrayOf<String>("Apple", "Banana", "Orange")

    // arrayOfNulls(): Verilen boyutca null elemanlarla doldurulmuş bir array verir.

    // Aşağıdaki kod 3 elemanlı ve elemanları String? olan bir array oluşturur ve başlangıc olarak tüm elemanlara null atar.
    val nullsArr = arrayOfNulls<String>(3)
    println("nullsArr: ${nullsArr[0]}, ${nullsArr[1]}, ${nullsArr[2]}")

    // Kotlinde primitive tipten array'ler oluşturmak için de built-in methodlar vardır.
    val intArray = intArrayOf(1,2,3)
    val byteArray = byteArrayOf(1,2,3)
    val charArray = charArrayOf('a', 'b', 'c')
    val longArray = longArrayOf(1,2,3)
    val shortArray = shortArrayOf(1,2,3)

    // Kotlin get ve set işlemleri için get() ve set() methodlarıda sağlar.

    val names = arrayOf("Ali", "Ayşe", "Ahmet")
    println("The first name: ${names.get(0)}")
    names.set(0, "Arık")
    println("The first name: ${names.get(0)}")

    // size property ile arrayin boyutunu alabiliriz. (length'i array üzerinde kullanamayız)

    println("The size of the array named 'names': ${names.size}")
    // Array boyutunu öğrenmek için aşağıdaki gibi count() methoduda kullanılabilir.
    println("The size of the array named 'names': ${names.count()}")

    // Tüm elemanları bir dizi ile alabiliriz.
    for (name in names) {
        println("Names: $name")
    }

    // in operatoru ile bir elemanın array'de olup olmadıgı kontrol edilebilir.

    if ("Arık" in names) {
        println("Arık exists in the array named 'names'")
    } else {
        println("Arık does not exist in the array named 'names'")
    }

    // distinct(): Array içinde tekrarlayan öğreleri sadece 1 kez olacak şekilde array'i return eder.
    // Not: Orjinal array değişmez.
    val myArr = arrayOf("Ahmet", "Ahmet", "Ali", "Ayşe", "Ayşe")
    val distinctArr = myArr.distinct()
    println(distinctArr)

    // drop() -- dropLast(): Bu methodları, arrayin elemanlarını baştan ya da sonran bırakmak için kullanabiliriz.
    // Not: Orjinal array'i değiştirmez.

    val droppedFirstTwoElements = myArr.drop(2)
    val droppedLastTwoElements = myArr.dropLast(2)
    println(droppedFirstTwoElements)
    println(droppedLastTwoElements)

    // isEmpty(): Arrayin empty olup olmadığını return eder.
    println(myArr.isEmpty())


}