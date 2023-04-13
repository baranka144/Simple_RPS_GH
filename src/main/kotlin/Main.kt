val RPS = arrayOf("Rock", "Paper", "Scissors")

fun getResult(computerChoice: String, playerChoice: String) {
    print("You choose $playerChoice. ")
    print("I choose $computerChoice. ")
    println(
        when (playerChoice) {
            computerChoice -> "It's a draw"
            RPS[0] -> {                             //Rock
                when (computerChoice) {
                    RPS[1] -> "I won ^_^"           //Paper
                    else -> "You won (︶︹︺)"       //Scissors
                }
            }
            RPS[1] -> {                             //Paper
                when (computerChoice) {
                    RPS[2] -> "I won ^_^"           //Scissors
                    else -> "You won (︶︹︺)"       //Rock
                }
            }
            else -> {                             //Scissors
                when (computerChoice) {
                    RPS[0] -> "I won ^_^"           //Rock
                    else -> "You won (︶︹︺)"       //Paper
                }
            }
        }
    )
}

fun getPlayerChoice(): String {
    while (true) {
        println("Please enter one of the following: Rock Paper Scissors.")
        val inputVariant = readln()
        if (RPS.contains(inputVariant)) return inputVariant
        else {
            println("You must enter a valid choice.")
            continue
        }
    }
}

fun getCompChoice() = RPS.random()

fun main() {
    val computerChoice = getCompChoice()
    val playerChoice = getPlayerChoice()
    getResult(computerChoice, playerChoice)
}