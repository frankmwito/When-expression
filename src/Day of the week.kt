import java.util.Scanner

fun main()  {
    println("Enter any number from 1 to 7")
    val reader = Scanner(System.`in`)
    val num = reader.nextInt()

    when(num) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")

        else -> println("Other day does not exist")
    }
}