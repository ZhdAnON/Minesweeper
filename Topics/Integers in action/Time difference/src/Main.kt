fun main() {
    val hour1 = readLine()!!.toIntOrNull()
    val minute1 = readLine()!!.toIntOrNull()
    val second1 = readLine()!!.toIntOrNull()
    val hour2 = readLine()!!.toIntOrNull()
    val minute2 = readLine()!!.toIntOrNull()
    val second2 = readLine()!!.toIntOrNull()

    val time1 = second1!! + minute1!! * 60 + hour1!! * 60 * 60
    val time2 = second2!! + minute2!! * 60 + hour2!! * 60 * 60
    println(time2 - time1)
}