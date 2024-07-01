import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    val num1 = reader.nextInt()
    val num2 = reader.nextInt()
    val op = reader.next()

    when(op) {
        "+" -> println(num1 + num2)
        "%" -> println(num1 % num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("Invalid operator")
    }
}