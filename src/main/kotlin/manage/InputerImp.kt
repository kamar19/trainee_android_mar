package manage

import Car

class InputerImp(val parkingManager: ParkingManager) : Inputer {
    override fun inputNameOwner(): String {
        println("Введите имя владельца автомобиля:")
        val nameOwner: String? = readlnOrNull()
        if (nameOwner != null) {
            val returnedCar = parkingManager.returnCar(nameOwner)
            if (returnedCar != null) {
                return "Возвращаемый автомобиль: модель: " + returnedCar.brand + " , цвет: " + returnedCar.carColor +
                        " , имя владельца: " + returnedCar.nameOwner + " , гос.номер: " + returnedCar.numer
            }
        }
        return "по указанному имени владельца: " + nameOwner + " автомобиль на парковке не зарегистрирован"
    }

    override fun inputCarNumer(): String {
        println("Введите гос номер автомобиля:")
        val numer: String? = readlnOrNull()
        if (numer != null) {
            val resultPlace = parkingManager.getInfoByCar(numer)
            if (resultPlace > 0) {
                return "Указанный автомобиль припаркован на место номер: " + resultPlace
            }
        }
        return "Указанный автомобиль не найден"
    }

    override fun inputNumberParkPlace(): String {
        println("Введите номер места парковки:")
        val index: Int? = readlnOrNull()?.toInt()
        if (index != null) {
            val car = parkingManager.getInfoByPlace(index)
            if (car != null) {
                return "На указанном месте запаркован автомобиль: модель: " + car.brand + " , цвет: " + car.carColor + " , гос.номер: " + car.numer
            }
        }
        return "Указанное место свободно"
    }

    override fun inputInfoForParking(): String {
        println("Введите имя владельца автомобиля:")
        val nameOwner: String? = readlnOrNull()
        if (nameOwner != null) {
            println("Введите модель автомобиля:")
            val brand: String? = readlnOrNull()
            if (brand != null) {
                println("Введите гос. номер автомобиля:")
                val numer: String? = readlnOrNull()
                if (numer != null) {
                    println("Введите цвет автомобиля:")
                    val carColor: String? = readlnOrNull()
                    if (carColor != null) {
                        val resultPlace = parkingManager.parkCar(Car(brand, carColor, numer, nameOwner))
                        if (resultPlace >= 0) {
                            return "Ваш автомобиль успешно припаркован на место номер: " + resultPlace
                        }
                        println("resultPlace = " + resultPlace)
                    }
                }
            }
        }
        return "Ваш автомобиль не был припаркован, обратитесь в службу техподдержки"
    }

}