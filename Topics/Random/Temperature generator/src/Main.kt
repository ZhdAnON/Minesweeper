import kotlin.random.Random

private const val DAYS_NUMBER = 7
private const val MIN_TEMPERATURE = 20
private const val MAX_TEMPERATURE = 30

fun generateTemperature(seed: Int): String {
    val temperatureList = mutableListOf<Int>()
    val randomList = Random(seed)
    repeat(DAYS_NUMBER) {
        temperatureList.add(randomList.nextInt(MIN_TEMPERATURE, MAX_TEMPERATURE + 1))
    }
    return temperatureList.joinToString(" ")
}