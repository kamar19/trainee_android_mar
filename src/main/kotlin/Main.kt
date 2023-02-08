import manage.InputerImp
import parking.Parking
import manage.ParkingManagerImp


fun main(args: Array<String>) {
    var isEnd = false
    Parking.initPlases()
    val parkingManager1 = ParkingManagerImp(Parking.plases)
    val inputer = InputerImp(parkingManager1)
    parkingManager1.setSomeValues()
    do {
        val currentCommand: String? = readlnOrNull()
        when (currentCommand) {
            Command.START.value -> {
                parkingManager1.printInfo.printHi()
            }

            Command.END.value -> {
                parkingManager1.printInfo.printBye()
                isEnd = true
            }

            Command.HELP.value -> {
                parkingManager1.printInfo.printHelp()
            }

            Command.RETURN.value -> {
                parkingManager1.printInfo.printStr(inputer.inputNameOwner())
            }

            Command.PARK_INFO_BY_CAR.value -> {
                parkingManager1.printInfo.printStr(inputer.inputCarNumer())
            }

            Command.PARK_INFO_BY_PLACE.value -> {
                parkingManager1.printInfo.printStr(inputer.inputNumberParkPlace())
            }

            Command.PARK.value -> {
                if (parkingManager1.getFreeCount() > 0) {
                    parkingManager1.printInfo.printStr(inputer.inputInfoForParking())
                }
            }

            Command.PARK_STATS.value -> {
                parkingManager1.printInfo.printParkStats()
            }

            Command.PARK_ALL_STATS.value -> {
                parkingManager1.printInfo.printParkAllStats()
            }

            else -> {
                parkingManager1.printInfo.printUnknownCommand()
            }
        }
    } while (!isEnd)

}
