import java.io.File

class DayOne {
    fun part1() {
        val input = File("src/main/resources/Day1").useLines { it.toList() }
        println(computeResult(input))
    }

    fun part2() {
        val input = File("src/main/resources/Day1").useLines { it.toList() }
        val replacedWithDigits = input.map {
            it.replace("one", "one1one")
                .replace("two", "two2two")
                .replace("three", "three3three")
                .replace("four", "four4four")
                .replace("five", "five5five")
                .replace("six", "six6six")
                .replace("seven", "seven7seven")
                .replace("eight", "eight8eight")
                .replace("nine", "nine9nine")
        }
        println(computeResult(replacedWithDigits))
    }

    fun computeResult(input: List<String>): Int {
        var result = 0
        input.map { it.filter { it.isDigit() } }.forEach {
            result += (it.first() + "" + it.last()).toInt()
        }
        return result
    }
}