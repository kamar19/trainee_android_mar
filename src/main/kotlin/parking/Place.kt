package parking

import Car

class Place(var isFree: Boolean = true, var car: Car? = null, var countPark: Int = 0) {
    fun getIsFree(): String =
        when (isFree) {
            true -> "cвободно"
            false -> "занято"
        }

}

