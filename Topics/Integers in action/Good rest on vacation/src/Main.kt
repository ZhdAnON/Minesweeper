fun main() {
    val duration = readLine()!!.toInt()
    val foodCost = readLine()!!.toInt()
    val flyCost = readLine()!!.toInt()
    val nightCost = readLine()!!.toInt()
    val result = (flyCost * 2) + (duration * foodCost) + (duration - 1) * nightCost
    println(result)
}