import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val shape: String = reader.next()

    when(shape){
        "triangle" -> println("3")
        "rectangle" -> println("4")
        "pentagon" -> println("5")
        "hexagon" -> println("16")
        else -> println("Invalid shape")
    }
}