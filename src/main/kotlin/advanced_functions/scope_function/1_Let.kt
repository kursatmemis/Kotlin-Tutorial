package advanced_functions.scope_function

/**
 * Let:
 * Nesneye erişim için 'it' keyword'unu kullanırız.
 * Lambda ifadesinin son satırını return eder.
 *
 * Ne Zaman Kullanılır?
 * Genellikle nesnenin null kontrolü yapılıp eğer nesne null değilse bir kod bloğunun çalıştırılmasını istediğimiz
 * durumlarda kullanılır.
 * Not: Eğer derdimiz sadece null kontrolü yapmak iste bunu diğer scope function'lar da yapabilmektedir.
 * Ancak genel kullanım, bunu let function'ı ile yapmaktır.
 *
 */

fun main() {

    val user = getUserFromDatabase()

    // Amacımız şu olsun: Eğer database'den gelen user null değil ise bilgilerini ekrana print edelim...

    // Let Kullanılmaya Kod:
    if (user != null) {
        println("Id: ${user.id}")
        println("Name: ${user.name}")
    }

    // Let Kullanılan Kod:
    user?.let {
        println("Id: ${it.id}")
        println("Name: ${it.name}")
    }

    // let methodu için kullandığımız lambda ifadesinin son satırında belirttiğimiz değer geriye return edilmesi
    // özelliği sayesinde de let methodunu kullanarak yeni bir değişken oluşturma işlemi de gerçekleştirebiliriz.

    val isUserIdHigherThan5 = user?.let {
        if (it.id > 5) {
            true
        }
        else {
            false
        }
    } ?: false
    println("Is User Id Higher Than 5: $isUserIdHigherThan5")

}

fun getUserFromDatabase() : User? {
    // Simüle etmek için; eğer randNum = 1 -> User, randNum = 2 ise null return eder.
    val randomNumber = (1..2).random()
    return if (randomNumber == 1) {
        User(1, "Alice")
    } else {
        null
    }
}

data class User(val id: Int, val name: String)