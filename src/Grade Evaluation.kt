import java.util.Scanner

fun main()  {
    println("Enter grade characters")
    val reader = Scanner(System.`in`)
    val grade = reader.nextLine()

    when(grade) {
        "A" -> println("Excellent")
        "B" -> println("Good")
        "C" -> println("Average")
        "D" -> println("Poor")
        "F" -> println("Fail")
        else -> println("Invalid grade")
    }


}