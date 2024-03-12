package lesson4.operators

/**
 * Operators:
 * Operatorler, compiler'a, belirli matematik veya lojik işlemleri gerçekleştirmesini söyleyen sembollerdir.
 * Aşağıda, Kotlin'de bulunan operator listesine yer verilmiştir:
 * 1. Arithmetic Operator
 * 2. Relational(Comparation) Operator
 * 3. Assignment Operator
 * 4. Unary Operator
 * 5. Logical Operator
 * 6. Bitwise Operator
 */

fun main(args: Array<String>) {

    // Arithmetic Operators
    val x: Int = 40
    val y: Int = 20

    println("x + y = " +  (x + y))
    println("x - y = " +  (x - y))
    println("x / y = " +  (x / y))
    println("x * y = " +  (x * y))
    println("x % y = " +  (x % y))

    println("====================")

    // Relational(Comparation) Operators
    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))

    println("====================")

    // Assignment Operators
    var z: Int = 40

    z += 5 // z = z + 5
    println("z += 5 = " + z ) // 45

    z = 40
    z -= 5
    println("z -= 5 = " +  z) // 35

    z = 40
    z *= 5
    println("z *= 5 = " +  z) // 200

    z = 40
    z /= 5
    println("z /= 5 = " +  z) // 8

    z = 43
    z %= 5 // z = z % 5
    println("z %= 5 = " + z) // 3

    println("====================")

    //  Unary Operators
    var a: Int = 40
    var b:Boolean = true

    println("+a = " +  (+a)) // 40
    println("-a = " +  (-a)) // -40
    println("++a = " +  (++a)) // 41
    println("--a = " +  (--a)) // 39
    println("!b = " +  (!b)) // false

    println("====================")

    // Logical Operators
    var i: Boolean = true
    var j: Boolean = false

    println("i && j = " +  (i && j)) // false
    println("i || j = " +  (i || j)) // true
    println("!j = " +  (!j)) // true

    println("====================")

    // Bitwise Operators (Bitsel Operatorler)
    // Kotlinde bitwise operatorler yoktur ancak kotlin bitsel işlemleri gerçekleştirmek için bir dizi fonksiyon sağlar.

    /**
     * Function         Description                 Example
     * shl (bits)	    İmzalı sola kaydır	        x.shl(y)
     * shr (bits)	    İmzalı sağa kaydır	        x.shr(y)
     * ushr (bits)	    İmzasız sağa kaydır		    x.ushr(y)
     * and (bits)	    Bit düzeyinde and	        x.and(y)
     * or (bits)	    Bit düzeyinde or	  	    x.or(y)
     * xor (bits)	    Bit düzeyinde xor	  	    x.xor(y)
     * inv()	        Bit düzeyinde ters	  	    x.inv()
     */

    var xx:Int = 60	  // 60 = 0011 1100
    var yy:Int = 13	  // 13 = 0000 1101
    var zz:Int

    zz = xx.shl(2)       // 240 = 1111 0000
    println("xx.shl(2) = " +  zz)

    zz = xx.shr(2)       // 15 = 0000 1111
    println("xx.shr(2) = " +  zz)

    zz = xx.and(yy)       // 12 = 0000 1100
    println("xx.and(yy)  = " +  zz)

    zz = xx.or(yy)        // 61 = 0011 1101
    println("xx.or(yy)  = " +  zz)

    zz = xx.xor(yy)       // 49 = 0011 0001
    println("xx.xor(yy)  = " +  zz)

    zz = xx.inv()        // -61 = 1100 0011
    println("xx.inv()  = " +  zz)

}