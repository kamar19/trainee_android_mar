package parking

import java.util.*
import kotlin.collections.ArrayList

class Place {
    var isFree: Boolean = false
    lateinit var storis: ArrayList<Storie>
}