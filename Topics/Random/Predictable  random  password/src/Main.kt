import kotlin.random.Random

private const val PASSWORD_LENGTH = 10
private const val START_CHAR = 33
private const val END_CHAR = 126

fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    val randomChar = Random(seed)
    repeat(PASSWORD_LENGTH) {
        randomPassword += randomChar.nextInt(START_CHAR, END_CHAR + 1).toChar()
    }
    return randomPassword
}