package parking

import car.Car

interface ParkingManager {
    fun returnCar(nameOwner: String): Car
    fun getInfoByCar(car: Car): Int

    fun getInfoByPlace(index: Int): Car

    fun parkCar(car: Car)

    fun printCurrentStateParking()

    fun printStatisticAllPlaces()

    fun printStatisticByPlace(index: Int)

}