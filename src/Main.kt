import java.util.Scanner

fun main()  {
    println("Enter any number between 0 and 5")
    val reader = Scanner(System.`in`)
    val num = reader.nextInt()

    when (num) {
        1 -> println("You have chosen a square")
        2 -> println("You have chosen a circle")
        3 -> println("You have chosen a triangle")
        4 -> println("You have chosen a rhombus")

        else -> println("There is no such shape")
    }
}