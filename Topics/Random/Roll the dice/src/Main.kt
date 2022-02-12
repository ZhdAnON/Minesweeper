import kotlin.random.Random

private const val MIN_VALUE = 1
private const val MAX_VALUE = 6

fun throwD6(): Int = Random.nextInt(MIN_VALUE, MAX_VALUE + 1)