package lesson1.comments

// Comments line in Kolin is make the code easier to read.

fun main() {

    // This is a single-line comment.

    /*
       This is a multi-line comment.
    */

    /**
     * This is a multi-line comment and this comment is used for documantation.
     *
     * Bunu genellikle detaylı olarak kodun ne yaptığını anlatmak istediğimizde, belgelendirme yapmak istediğimizde
     * kullanırız.
     *
     * Bu yorum satırı içerisinde @return, @param, @author gibi etiketler ekleyebiliriz.
     */

    // Aşağıdaki methodun üstüne imleç ile gelirsek, kotlin bize bu methodun üstünde yazan yorum satırındaki verileri
    // dökümantasyon olarak gösterir.
    greeting("Kursat")
}


/**
 * Greet a person by their name.
 *
 * @param name The name of the person to greet
 * @return The greeting message
 * @author Kursat Memis
 */
fun greeting(name: String) : String {
    return "Hello $name"
}