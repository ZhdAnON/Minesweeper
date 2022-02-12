import kotlin.random.Random

private const val SEED_RANGE_START = 1
private const val SEED_RANGE_END = 1000
private const val MIN_VALUE = 1
private const val MAX_VALUE = 6

fun createDiceGameRandomizer(n: Int): Int {
    var sumResult = 0
    var sumTemp = 0
    var result = 0
    for (seed in SEED_RANGE_START..SEED_RANGE_END) {
        val random = Random(seed)
        repeat(n) {
            sumTemp += random.nextInt(MIN_VALUE, MAX_VALUE + 1)
        }
        if (sumTemp > sumResult) {
            sumResult = sumTemp
            result = seed
        }
    }
    return result
}