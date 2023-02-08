package parking

object Parking {
    val plases: MutableList<Place> = arrayListOf()
    fun initPlases() {
        for (i in 0..19) {
            plases.add(Place())
        }
    }

}