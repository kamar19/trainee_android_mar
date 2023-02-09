package manage

import parking.Parking

class PrintInfoImp() : PrintInfo {
    override fun printStatisticByPlace(index: Int) {
        if (Parking.plases.get(index).countPark > 0) {
            println("По указаному месту было запаркованно, автомобилей: " + Parking.plases.get(index).countPark.toString())
        } else {
            println("По указаному месту не было запаркованно автомобилей")
        }
    }

    override fun printStr(string: String) {
        println(string)
    }

    override fun printHelp() {
        println("Доступные команды:")
        println("/start - Выводит приветствие")
        println("/end - Выход из программы")
        println("/help - Выводит информацию о доступных командах")
        println("/return - Возвращает автомобиль владельцу")
        println("/park - Паркует автомобиль на любое свободное место")
        println("/park_info_by_car - Выводит информацию о месте, где припаркован автомобиль")
        println("/park_info_by_place - Выводит информацию о машине по месту на парковке")
        println("/park_stats - Возвращает текущую загрузку парковки")
        println("/park_all_stats - Возвращает количество автомобилей, которые были припаркованы за время работы приложения.")
    }

    override fun printParkStats() {
        for (i in 0..19) {
            print("P" + i.toString() + ": " + Parking.plases.get(i).getIsFree())
            if (i < Parking.plases.size) {
                print(", ")
            }
        }
        println()
    }

    override fun printParkAllStats() {
        println("За время работы приложения было припаркованно,  автомобилей: " + Parking.plases.sumOf { it.countPark })
    }

    fun printHi() {
        println("Приветствуем в приложении парковка в стиле old. Рады вас видеть!!!")
    }

    fun printBye() {
        println("До свидания!")
    }

    fun printUnknownCommand() {
        println("Программа не может обработать запрос. Для получения сведений о доступных командах введите команду /help")
    }

}