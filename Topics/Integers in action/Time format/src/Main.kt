fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // don't change this line

    val calc1 = (totalSeconds / 3600) % 24
    val calc2 = (totalSeconds % 3600) / 60
    val calc3 = (totalSeconds % 3600) % 60

    println("$calc1:$calc2:$calc3")
}