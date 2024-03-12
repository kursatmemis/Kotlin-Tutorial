package advanced_functions.scope_function

/**
 * With:
 * Nesneye erişim için 'this' keyword'ünü kullanırız.
 * Lambda ifadesinin son satırını return eder.
 *
 * Diğer Scope Function'lardan farklı olarak; üzerinde işlem yapılan nesne, with fonksiyonuna parametre olarak verilir.
 * İkinci parametre ise, bu nesne üzerinde çalışacak kodları belirttiğimiz lambda ifadesidir.
 *
 * Ne Zaman Kullanalım?
 * Scope içinde nesnenin özelliklerini kullanarak bir şeyler hesaplamamız gerekirse ve bu hesaplama sonucunu
 * bir değere atamamız gerekirse kullanırız. (Run'da aynı bunun gibi.)
 *
 */

fun main() {

    val screen = Screen()

    val maxViewCount = with(screen) {
        height = 1000
        weight = 250
        darkModeEnabled = false
        language = "German"
        printScreenInfo(this)

        // Ekranda maksimum kaç view olması gerektiğini belirtir.
        val maxViewCount = (height * weight) / 10000
        maxViewCount
    }

    if (maxViewCount < 5) {
        println("Bu telefon ekranı için tasarım yapılamaz.")
    } else {
        println("Bu telefon ekranı için tasarım yapılabilir.")
    }

}

fun printScreenInfo(screen: Screen) {
    println("${screen.height} x ${screen.weight} && ${screen.language} && ${screen.darkModeEnabled}")
}

data class Screen(
    var height: Int = 870,
    var weight: Int = 250,
    var language: String = "English",
    var darkModeEnabled: Boolean = false
)