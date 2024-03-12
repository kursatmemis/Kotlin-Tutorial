package lesson8.ranges

/**
 * Kotlinde 'Range', her ikiside aralığa dahil olan iki değer aralığı olarak tanımlanır.
 *
 * Range Oluşturmak İçin:
 * 1. (..) operator
 * 2. rangeTo()
 * 3. downTo()
 *
 */

fun main(args: Array<String>) {

    for (number in 1..10) {
        print("$number ") // 1-10 arasındaki sayıları print eder.
    }

    println()

    for (character in 'a'..'z') {
        print("$character ") // a - z arası harfleri print eder.
    }

    println()

    for (capitalChar in 'A'..'Z') {
        print("$capitalChar ") // A - Z arası harfleri print eder.
    }

    println()

    println("================================")

    // Creating Ranges using rangeTo()

    for (num in 1.rangeTo(4)) {
        println(num)
    }

    println("================================")

    // Creating Ranges using .. Operator
    // .. operatoru aslında rangeTo() methodunu çağırır.

    for (n in 1..4) {
        println(n)
    }

    println("================================")

    // Creating Ranges using downTo() Operator

    for (myNum in 4.downTo(1)) {
        println(myNum)
    }

    println("================================")

    // step(): Range'deki sayıları kaçar kaçar gezeceğimizi belirler.

    for (myNumber in 1..10 step 2) {
        println(myNumber)
    }

    println("================================")

    // Kotlin range of Characters

    for (ch in 'a'..'e') {
        println(ch)
    }

    println("================================")

    // reversed(): Range'in değerlerini tersine çevirmek için kullanılabilir.

    for (n in (1..4).reversed()) {
        println(n)
    }

    println("================================")

    // until(): Bir range oluşturur ama son eleman dahil değil.

    for (nn in 1 until 5) {
        println(nn)
    }

    println("================================")

    // first, last, step: We can use first, last and step properties of a range to find the first, the last value or the step of a range.

    println((5..10).first) // the first element of the range
    println((5..10).last) // the last element of the range
    println((5..10).step) // the step of the range

    println("================================")

    // filter(): Range içinde belirtilen filtreye uyan elemanları bir liste olarak return eder.

    val a = 1..10
    val f = a.filter { number -> number % 2 == 0 } // 2'ye kalansız bölünenlerin listesini verir.
    println(f)

    println("================================")

    // distinct(): Range içinde tekrarlayan elemanlar sadece 1 kez olacak şekilde geriye liste dönderir.

    val aa = listOf(1, 1, 2, 4, 4, 6, 10)
    println(aa.distinct())

    println("================================")

    // min, max, sum, average, count: minimum, maksimum, toplam, ortalama ve eleman sayısını verir.

    val myRange = 1..10

    println(myRange.min())
    println(myRange.max())
    println(myRange.sum())
    println(myRange.average())
    println(myRange.count())
}