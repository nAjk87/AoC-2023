
import kotlin.system.exitProcess

fun main() {

    println("Willkommen aus Advent Of Code 2023")

    while (true) {
        println("Välj dag för att köra grejerna, skriv t.ex 1 för dag1, eller hejdå för hejdå")

        when (readln()) {
            "1" -> {
                DayOne().part1()
                DayOne().part2()
                break
            }
            "hejdå" -> exitProcess(1337)
            else -> println("????? try again")
        }
    }
}