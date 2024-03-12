package advanced_functions.scope_function

/**
 * Apply:
 * Nesneye erişim için 'this' keyword'ünü kullanırız.
 * Geriye nesnenin kendisini return eder.
 * "Verilen kod bloğunu nesneye uygula ve nesneyi geri döndür." şeklinde yorumlanabilir.
 *
 * Ne Zaman Kullanalım?
 * Nesneyi inşa etmek veya field'larını değiştirmek istediğimizde bunu kullanırız.
 * Not: Amacımız sadece nesnenin değerlerini değiştirmekse bunu diğer scope func'larda da yapabiliriz.
 * Ancak diğer scope function'ların hepsi, apply function'ı gibi nesneyi return etmezler.
 * Ayrıca, nesnenin return edilmesine ihtiyacımızın olmadığı durumlarda bile, genel kullanım bunu apply func'ı ile
 * yapmaktır.
 *
 */

fun main() {

    val student = Student().apply {
        id = 1
        name = "Alice"
        surname = "Doe"
    }

    println("Student: $student")

    val list = listOf(Student(2, "John", "Dalton"), Student(3, "Steve", "Penelope"))
    val mutableListOfStudents = list.toMutableList().apply {
        add(0, student)
    }
    println("List of Students: $mutableListOfStudents")

}

data class Student(
    var id: Int? = null,
    var name: String? = null,
    var surname: String? = null
)