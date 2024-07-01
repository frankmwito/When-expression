import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    val color: String = reader.next()

    when(color){
        "red"-> println("stop")
        "Yellow" -> println("slow down")
        "green"  -> println("go")

        else -> println("invalid light")
    }
}