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

fun countLetters(text: String): IntArray {
    val counts = IntArray('z' - 'a' + 1)

    for(char in text) {
        val charLower = char.toLowerCase()
        if(charLower !in 'a'..'z') continue
        counts[charLower - 'a']++
    }
    return counts
}

fun main() {
    val x = countLetters("abcd")
}