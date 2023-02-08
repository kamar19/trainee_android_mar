package manage

import Car

interface ParkingManager {
    fun returnCar(nameOwner: String): Car?
    fun getInfoByCar(numer: String): Int
    fun getInfoByPlace(index: Int): Car?
    fun parkCar(car: Car): Int

}