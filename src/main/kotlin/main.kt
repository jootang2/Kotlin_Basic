fun max(a: Int, b: Int) = if (a > b) a else b // 코틀린에서는 조건문을 식으로 사용 가능
fun renamePackage(fullName: String, newName: String): String {
    val i = fullName.lastIndexOf('.')
    val prefix = if (i >= 0) fullName.substring(0, i + 1) else return newName
    return prefix + newName
}

fun main() {
    val sum = 0
    val num

    do {
        num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

  println("Sum: $sum")
}