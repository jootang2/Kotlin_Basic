import java.util.*
import kotlin.math.PI

//fun main() {
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    println(a+b)
//
//    val c : Int
//    c = 100
//    println(c)
//    val d : String = "Hello!"
//
//    val name = "John"
//    println("안녕, $name!\n 오늘은 ${Date()}")
//
//    println(intArrayOf(1,2,3).isEmpty())
//    println(intArrayOf(1,2,3).isNotEmpty())

/*기본적인 함수의 구조*/
//    fun circleArea(radius: Double): Double {
//        return PI*radius*radius
//    }
//
//    fun main() {
//        print("Enter radius: ")
//        val radius = readLine()!!.toDouble()
//        println("Circle area: ${circleArea(radius)}")
//    }
/*함수*/
//fun increment(a: IntArray) : Int {
//    return ++a[0]
//}
//
//fun main() {
//    val a = intArrayOf(1,2,3)
//    println(increment(a))
//    println(a.contentToString())
//}
/*타입을 정하지 않아도 되는 함수*/
//fun prompt(name: String) {
//    println("****** Hello, $name! ******")
//}
//
//fun prompt(name: String) : Unit {
//    println("****** Hello, $name! ******")
//}
// 위 두개의 함수는 같다.

//fun rectangleArea(width: Double, height: Double) : Double {
//    return width*height
//}

//fun main() {
//    val w = readLine()!!.toDouble()
//    val h = readLine()!!.toDouble()
//
//    println("RectangleArea : ${rectangleArea(w,h)}")
//}

/*Overloading*/
fun mul(a: Int, b: Int) = a*b
fun mul(a: Int, b: Int, c:Int) = a*b*c
fun mul(s: String, n: Int) = s.repeat(n)
fun mul(o: Any, n: Int) = Array(n){o}

//fun readInt(radix: Int = 10) = readLine()!!.toInt(radix)
//fun printSorted(vararg items: Int) {
//    items.sort()
//    println(items.contentToString())
//}

fun main() {
//    printSorted(1,5,4,2)
//    println(readInt() + readInt())
    fun readInt() = readLine()!!.toInt()
    println(readInt() + readInt())
}



//}