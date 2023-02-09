package manage

import Car
import parking.Place

class ParkingManagerImp(val plases: MutableList<Place>) : ParkingManager {
    val printInfo: PrintInfoImp = PrintInfoImp()

    override fun returnCar(nameOwner: String): Car? {
        plases.forEach {
            if (!it.isFree) {
                if (it.car?.nameOwner.equals(nameOwner)) {
                    it.isFree = true
                    return it.car
                }
            }
        }
        return null
    }

    override fun getInfoByCar(numer: String): Int {
        var index = -1
        for (i in 0..19) {
            plases.get(i).let {
                if (it.isFree == false) {
                    if (it.car?.numer.equals(numer)) {
                        index = i
                    }
                }
            }
        }
        return index
    }

    override fun getInfoByPlace(index: Int): Car? {
        return plases.get(index).car
    }

    override fun parkCar(car: Car): Int {
        for (i in 0..19) {
            plases.get(i).let {
                if (it.isFree == true) {
                    it.car = car
                    it.isFree = false
                    it.countPark++
                    return i
                }
            }
        }
        return -1
    }

    fun setSomeValues() {
        plases.let {
            it.get(0).car = Car("ford", "белый", "45F", "Иван")
            it.get(0).countPark = 1
            it.get(0).isFree = false
            it.get(1).car = Car("audi", "черный", "115D", "Николай")
            it.get(1).countPark = 1
            it.get(1).isFree = false
            it.get(5).car = Car("bmw", "синий", "48FU", "Алла")
            it.get(5).countPark = 1
            it.get(5).isFree = false
            it.get(15).car = Car("fiat", "красный", "14RT", "Оля")
            it.get(15).countPark = 1
            it.get(15).isFree = false
            it.get(17).car = Car("ford", "белый", "05D", "Федор")
            it.get(17).countPark = 1
            it.get(17).isFree = false
        }
    }

    fun getFreeCount(): Int {
        return plases.count { it.isFree ?: false }
    }

}