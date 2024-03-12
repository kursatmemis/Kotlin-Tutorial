package advanced_functions

// filter(): Parametre olarak bir predicate alır ve bu predicate'de belirtilen koşula uyan öğelerin listesini return eder.
// map(): Koleksiyonun içindeki öğeleri, bizim belirttiğimiz koşula göre dönüştürür ve bu yeni öğelerin koleksiyonunu
//        return eder.

fun main() {
    understandingFilterMethod()
    println("======================================")
    understandingMapMethod()
    println("======================================")
    applyTheseMethodsOnObjects()
}

fun understandingFilterMethod() {
    /*
        Filter:
        - Default olarak Kotlin'de tanımlı bir method'dur.
        - Koleksiyonlar üzerinde filtreleme işlemi yapmamızı sağlar.
        - Orjinal koleksiyonu değiştirmez. Geriye yeni bir koleksiyon return eder.
        - Bir koleksiyon üzerinden filter methodunu bir predicate ile çağırırız. Predicate, filter methoduna parametre
          olarak verdiğimiz ve içerisinde bir koşul tanımladığımız lambda function'dır. Koleksiyon içindeki verilerden
          belirttiğimiz koşula uygun olanların bir listesi geriye return edilecektir.
          Not: Filter methodu, eğer list veya set objesi üzerinden çağrılmış ise geriye bir list return eder.
                               eğer map üzerinden çağrılmış ise geriye bir map return eder.

         Eğer element index'i ile işimiz yok, sadece koleksiyon içindeki öğelerin değerleri ile işimiz varsa;
         'filter()' methodunu kullanırız. Ancak;
         Eğer elementlerin indexlerini veya pozisyonlarını kullanarak filtreleme yapmak istiyorsak bu durumda
         'filterIndexed()' methodunu kullanmamız gerekir.
     */

    /**
     * Liste Üzerinde listOf Methodunun Kullanımı:
     */
    val randomNumbers = listOf(3, 5, 1, 9, 10, 8, 17, 2, 20, 19)

    // number -> number > 5: '->' işaretinin solunda koleksiyondaki öğeleri sırayla temsil edecek değişkenin adını
    //                       belirtiyoruz. '->' işaretinin sağında ise koşulu belirtiyoruz.
    val listOfBiggerThan5 = randomNumbers.filter { number -> number > 5 }
    println("List of elements bigger than 5: $listOfBiggerThan5")

    // Pratik olarak direkt 'it' diyerekte kullanabiliriz. 'it', koleksiyon öğelerini sırayla temsil eden değişkenin
    // adıdır.
    val listOfLessThan7 = randomNumbers.filter { it < 7 }
    println("List of elements less than 7: $listOfLessThan7")

    println("===============================================================================")

    /**
     * Map Üzerinde listOf Methodunun Kullanımı:
     */
    val mapOfPersonAges = mapOf("Ali" to 17, "Hasan" to 22, "Furkan" to 24, "Ayse" to 28, "Kaan" to 30, "Yavuz" to 40)
    val newMap = mapOfPersonAges.filter { (name, age) -> name.length > 4 && age > 20 }
    println(newMap)

    /**
     * filterIndexed() Methodu:
     */

    val listOfNames = listOf("Muhammet", "Kursat", "Memis", "Ali", "Ahmet", "Yasa")

    // Index pozisyonu tek olan ve A ile baslamayan isimleri barındıran bir liste return eder.
    val listOfFiltredNames = listOfNames.filterIndexed { index, name -> index % 2 != 0 && !name.startsWith('A') }
    println("List of filtred names: $listOfFiltredNames")

    /**
     * filterNot() Methodu:
     */

    // Verilen predicate ile eşleşmeyen öğelerin bir koleksiyonunu return eder.
    // Yani uzunluğu 5'den büyük olmayan isimleri return eder.
    val listOfNotMatchingElements = listOfNames.filterNot { it.length > 5 }
    println("List of not matching elements: $listOfNotMatchingElements")
}

fun understandingMapMethod() {

    /*
        Map:
        - Default olarak Kotlin'de tanımlı bir method'dur.
        - Koleksiyonları transform etmemizi sağlar. (Koleksiyon içindeki öğelere yeni bir değer atamak gibi düşün)
        - Orjinal koleksiyonu değiştirmez. Geriye yeni bir koleksiyon return eder.
        - Bir koleksiyon üzerinden map methodunu bir transform ile çağırırız. Transform, map methoduna parametre
          olarak verdiğimiz ve içerisinde bir transform işlemi tanımladığımız lambda function'dır. Koleksiyon içindeki
          veriler belirttiğimiz transofrom'a göre değişecek ve yeni liste geriye return edilecektir.

        Not: Eğer index'lerle işimiz yoksa direkt map() methodunu kullanabiliriz.
             Ancak index'leri de kullanmak istiyorsak, mapIndexed() methodunu kullanmalıyız.
     */

    val listOfNumbers =  listOf (1, 2, 3, 4, 5, 6, 7, 8, 9)

    /**
     * map() Methodu:
     */

    // Liste içinedki elemanların hepsini 2 ile çarpar ve geriye bu yeni değerleri içeren liste return eder.
    val transformedList = listOfNumbers.map { number -> number*2 }
    println("Transformed List: $transformedList")

    /**
     * mapIndexed() Methodu:
     */

    println("=====================================================")

    val newList = listOfNumbers.mapIndexed {
        index, number -> index * number
    }

    println("New List: $newList")
}

fun applyTheseMethodsOnObjects() {
    val x = X()

    val p1 = Person("Ali", 10)
    val p2 = Person("Asli", 20)
    val p3 = Person("Hakan", 30)
    val p4 = Person("Kaan", 40)
    val p5 = Person("Kadir", 50)

    val s = "asd"
    s.split(" ")

    val listOfPeople = listOf(p1, p2, p3, p4, p5)

    // Yasi 30'dan kucuk olanları yeni bir liste olarak elde eder bu yeni listedeki öğelerin isimlerinin sonlarına
    // Memis ekler ve bu sadece isimleri geriye return eder.
    val newNames = listOfPeople.filter { it.age < 30 }.map { it.name.plus(" Memis") }
    println("New Names: $newNames")
}

data class Person(var name: String, var age: Int)

class X {
    fun ss(){

    }
}