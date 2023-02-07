fun main(args: Array<String>) {
    var isEnd = false
    do {
        val currentCommand: String? = readlnOrNull()
        when (currentCommand) {
            Command.START.value -> {
                println("Привет! Рад вас видеть!!!")
            }

            Command.END.value -> {
                println("До свидания!")
                isEnd = true
            }

            Command.HELP.value -> {
                println("Доступные команды:")
                println("/start - Выводит приветствие")
                println("/end - Выход из программы")
                println("/help - Выводит информацию о доступных командах")
            }

            else -> {
                println("Программа не может обработать запрос. Для получения сведений о доступных командах введите команду /help")
            }
        }

    } while (!isEnd)
}