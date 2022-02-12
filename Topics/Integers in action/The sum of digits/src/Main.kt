fun main() {
    val numberStr = readLine()!!.toIntOrNull()
    val char1 = numberStr!! / 100
    val char2 = (numberStr % 100) / 10
    val char3 = (numberStr % 100) % 10
    val result = char1 + char2 + char3
    println(result)
}