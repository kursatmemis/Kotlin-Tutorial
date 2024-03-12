package advanced_functions.scope_function

/**
 * Run:
 * Nesneye erişim için 'this' keyword'ünü kullanırız.
 * Lambda ifadesinin son satırını return eder.
 *
 * Ne Zaman Kullanalım?
 * Kotlin şöyle demiş: Hem nesne field'ları üzerinde oynama yapmak hem de bu field'lar üzerinde hesaplama yapıp
 * geriye bir değer return etmek istenildiğinde kullan. (With'de aynı bunun gibi.)
 *
 * Örnek bir kullanım:
  val password: Password = PasswordGenerator().run {
         seed = "someString"
         hash = {s -> someHash(s)}
         hashRepetitions = 1000

         generate() // görüldüğü üzere bir hesaplama yapıp bu hesaplamanın socunu return edilmek isteniyor.
     }
 *
 */

fun main() {
    val user = getUserFromDatabase()

    // Amacımız şu olsun: Eğer database'den gelen user null değil ise bilgilerini ekrana print edelim...

    // Run Kullanılmaya Kod:
    if (user != null) {
        println("Id: ${user.id}")
        println("Name: ${user.name}")
    }

    // Run Kullanılan Kod:
    user?.run {
        println("Id: ${this.id}")
        println("Name: ${this.name}")
    }

    // run methodu için kullandığımız lambda ifadesinin son satırında belirttiğimiz değer geriye return edilmesi
    // özelliği sayesinde de run methodunu kullanarak yeni bir değişken oluşturma işlemi de gerçekleştirebiliriz.

    val isUserIdHigherThan5 = user?.run {
        if (this.id > 5) {
            true
        }
        else {
            false
        }
    } ?: false
    println("Is User Id Higher Than 5: $isUserIdHigherThan5")

    // Öyle ki; run bloğu, nesnenin bir bağlamı olduğundan dolayı 'this' keyword'ünü bile kullanmamıza gerek yoktur.

    val numbers = mutableListOf(1,2,3)

    val total = numbers.run {
        /*this.add(4)
        this.add(5)
        this.sum()*/
        add(4)
        add(5)
        sum()
    }

    println("Total of numbers: $total")
}
