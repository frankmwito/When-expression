import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    val number = reader.nextInt()

    when {
        number > 0 -> println("positive")
        number < 0 -> println("Negative")
        number == 0 -> println("Zero")

        else -> println("Invalid input")
    }

}