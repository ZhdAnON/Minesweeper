fun main() {
    val group1 = readLine()!!.toShortOrNull()
    val group2 = readLine()!!.toShortOrNull()
    val group3 = readLine()!!.toShortOrNull()
    val desks = group1!! / 2 + group1 % 2 + group2!! / 2 + group2 % 2 + group3!! / 2 + group3 % 2
    println(desks)
}