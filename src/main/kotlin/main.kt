import java.lang.NumberFormatException
import java.text.NumberFormat
import kotlin.random.Random

//fun max(a: Int, b: Int) = if (a > b) a else b // 코틀린에서는 조건문을 식으로 사용 가능
//fun renamePackage(fullName: String, newName: String): String {
//    val i = fullName.lastIndexOf('.')
//    val prefix = if (i >= 0) fullName.substring(0, i + 1) else return newName
//    return prefix + newName
//}

//fun main() {
//    var sum = 0
//    var num : Int
//    do {
//        num = readLine()!!.toInt()
//        sum += num
//    } while (num != 0)
//
//  println("Sum: $sum")
//}

//fun main() {
//    val num = Random.nextInt(1, 101)
//    var guess = 0
//
//    while(guess != num) {
//        guess = readLine()!!.toInt()
//        if ( guess < num ) println("Too small")
//        else if ( guess > num ) println("Too big")
//    }
//
//    println("Right: it's $num")
//}

//fun main() {
//    val a = IntArray(10) {it * it}
//    var sum = 0
//
//    for(x in a) {
//        sum += x
//    }
//
//    println("Sum: $sum")
//}

//fun main() {
//    val num = Random.nextInt(1, 101)
//
//    while (true) {
//        val guess = readLine()!!.toInt()
//
//        if (guess < num) println("Too small")
//        else if (guess > num) println("Too big")
//        else break
//    }
//
//    println("Right: it's $num")
//}
//
//fun main() {
//    val num = Random.nextInt(1, 101)
//
//    while(true) {
//        val guess = readLine()!!.toInt()
//        val message =
//            if (guess < num) "Too small"
//        else if (guess > num) "Too big"
//        else break
//        println(message)
//    }
//}

//fun countLetters(text: String): IntArray {
//    val counts = IntArray('z' - 'a' + 1)
//
//    for(char in text) {
//        val charLower = char.toLowerCase()
//        if(charLower !in 'a'..'z') continue
//        counts[charLower - 'a']++
//    }
//    return counts
//}
//
//fun main() {
//    val x = countLetters("abcd")
//}
//
//fun parseIntNumber(s: String): Int {
//    var num = 0
//
//    if (s.length !in 1..31) throw NumberFormatException("Not a number: $s")
//
//    for (c in s) {
//        if (c !in '0'..'1') throw NumberFormatException("Not a number: $s")
//        num = num * 2 + (c - '0')
//    }
//
//    return num
//}

//class Person {
//    var firstName: String = ""
//    var familyName: String = ""
//    var age: Int = 0
//
//    fun fullName() = "$firstName $familyName"
//
//    fun showMe() {
//        println("${fullName()}: $age")
//    }
//}
//
//fun showAge(p: Person) = println(p.age)
//fun readAge(p: Person) {
//    p.age = readLine()!!.toInt()
//}
//
//fun showFullName(p:Person) = println(p.fullName())
class Person(firstName: String, familyName: String) {
    val fullName = "$firstName $familyName"

    init {
        println("init code")
    }
}
fun main() {
    val person = Person("John", "Doe")
    val secondPerson = Person("hwan", "joo")
    println(person.fullName)
}