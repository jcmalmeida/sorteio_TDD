import kotlin.random.Random

// Criar uma aplicação que sorteia um número entre dois inteiros e mantém o usuário respondendo até que ele acerte, provendo um feedback se o número chutado foi maior ou menor que o sorteado.
// A aplicação deve conter testes unitários

class RandomNumber(
    inferiorLimit: Int,
    superiorLimit: Int,
    private val randomNumber: Int = Random.nextInt(inferiorLimit, superiorLimit)
) {

    fun checkGuessedNumber(guessedNumber: Int): GuessFeedback  {
        return when {
            guessedNumber == randomNumber -> GuessFeedback.EQUAL
            guessedNumber < randomNumber ->  GuessFeedback.BIGGER
            else -> GuessFeedback.SMALLER
        }
    }

}

enum class GuessFeedback(val string: String) {
    EQUAL("O número sorteado é igual."),
    SMALLER("O número sorteado é menor."),
    BIGGER("O número sorteado é maior.")
}

fun main() {

    println("Digite o número inteiro inferior:")
    val inferiorLimit = readln().toInt()
    println("Digite o número inteiro superior:")
    val superiorLimit = readln().toInt()

    val randomNumber = RandomNumber(inferiorLimit, superiorLimit)

    do {

        println("Digite o chute:")
        val guessedNumber = readln().toInt()
        val guessResult = randomNumber.checkGuessedNumber(guessedNumber)
        println(guessResult.string)

    } while (guessResult != GuessFeedback.EQUAL)

}