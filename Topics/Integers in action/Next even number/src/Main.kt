fun main() {
    val number = readLine()!!.toIntOrNull()
    if (number!! % 2 == 0) println(number + 2)
    else println(number + 1)
}