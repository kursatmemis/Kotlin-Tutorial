package advanced_functions.scope_function

/**
 * Also:
 * Nesneye erişim için 'it' keyword'ünü kullanırız.
 * Geriye nesnenin kendisini return eder.
 * Adından da anlaşılacağı gibi 'ayrıca bunu da yap' gibi bir mantık barındırır.
 *
 * Ne Zaman Kullanalım?
 * Aslında apply ile yapılan işer bununla yapılabilir. Aralarındaki fark, apply'da this keyword'üne bir isim veremem
 * ancak; also'da it keyword'üne yeni bir isim verebilirsin. Yani eğer isim vermek istiyorsan bunu kullan.
 *
 * Kotlin şöyle demiş: Nesneyi değiştirmeyen, sadece debug işlemleri için print ya da log kaydı
 * tutmak istediğiniz zaman bunu kullanın.
 *
 * Yani genel olarak bir nesne üzerinde bir şey yaptıktan sonra 'ayrıca şunu da yap' dediğimiz zaman bunu kullanırız.
 */

fun main() {

    val listOfNumbers = mutableListOf(1,2,3)

    listOfNumbers.add(4).also {
        println("4 is added to list!")
    }

}