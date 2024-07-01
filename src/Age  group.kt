import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    val age : Int = reader.nextInt()

    when {
        age in 0..12 -> println("child")
        age in 13..17 -> println("Teen")
        age in 18..35 -> println("Adult")
        age > 35 -> println("Senior")
        else -> println("Invalid age")
    }
}