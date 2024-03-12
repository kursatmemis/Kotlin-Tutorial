package advanced_functions

// Predicate: Bir koleksiyon öğesini alan ve geriye true ya da false döndüren lambda'lara denir.

fun main() {

    val myNumList = listOf(1, 3, 5, 7, 9, 11, 13, 15)

    // Koleksiyondaki tüm elemanlar verilen predicate ile eşleşiyorsa true return eder.
    // Koleksiyondaki en az bir eleman verilen predicate ile eşleşmiyorsa false return eder.
    // Eğer koleksiyon boş ise true return eder.
    // '->' işaretinin solunda yazdığımız kısım, koleksiyondaki her öğeyi teker teker kontrol ederken onlara verdiğimiz
    // takma ismi, sağda yazdığımız kısım ile belirlediğimiz koşul ifadesini temsil eder.
    val allCheck = myNumList.all { num -> num > 5 }
    println("All Check: $allCheck")

    // Pratik bir gösterim: Default olarak kotlin her öğeye 'it' diye bir takma isim verir.
    myNumList.all {it > 5}

    println("================================")

    // Koleksiyondaki en az bir eleman verilen predicate ile eşleşiyorsa true return eder.
    val anyCheck = myNumList.any { it > 5 }
    println("Any Check: $anyCheck")

    println("================================")

    // Koleksiyonda verilen predicate ile eşleşen öğe sayısını return eder.
    val totalCount = myNumList.count { it > 5 }
    println("Total Count: $totalCount")

    println("================================")

    // Verilen predicate'e uyan ilk elemanı return der.
    val findNum = myNumList.find { it > 5 }
    println("FindNum: $findNum")

    println("================================")

    // Verilen predicate'e uyan son elemanı return eder.
    val findLastNum = myNumList.findLast { it > 5 }
    println("FindLastNum: $findLastNum")

    println("================================")

    // Farklı Bir Kullanım:
    val myPredicate = {number: Int -> number > 5}

    val result = myNumList.all(myPredicate)
    println("Result: $result")
}