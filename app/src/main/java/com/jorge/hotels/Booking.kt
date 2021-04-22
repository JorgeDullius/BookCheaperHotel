package com.jorge.hotels

import com.jorge.hotels.Hotel.AtlanticSeaHotel
import com.jorge.hotels.Hotel.BotanicalParkHotel
import com.jorge.hotels.Hotel.FlowerParkHotel
import java.util.*

class Booking(
    private val checkIn: Calendar,
    private val checkOut: Calendar,
    clientType: ClientType
) {
    var numberOfWeekendDays: Int = 0
    var numberOfWeekDays: Int = 0
    var botanicalParkPrice: Float = 0.0f
    var atlanticSeaPrice: Float = 0.0f
    var flowerParkHotel: Float = 0.0f

    init {
        numberOfWeekendDays = calculateNumberOfWeekendDays()
        numberOfWeekDays = calculateNumberOfWeekDays()
        botanicalParkPrice = BotanicalParkHotel().calculateDayPrice(
            clientType, numberOfWeekendDays, numberOfWeekDays
        )
        atlanticSeaPrice = AtlanticSeaHotel().calculateDayPrice(
            clientType, numberOfWeekendDays, numberOfWeekDays
        )
        flowerParkHotel = FlowerParkHotel().calculateDayPrice(
            clientType, numberOfWeekendDays, numberOfWeekDays
        )
    }

    private fun calculateNumberOfWeekendDays(): Int {
        var numberOfWeekendDays = 0
        val checkInAux = checkIn
        checkIn.compareTo(checkOut)
        while (checkIn.before(checkOut)) {
            if (checkIn.get(Calendar.DAY_OF_WEEK) == 1 || checkIn.get(Calendar.DAY_OF_WEEK) == 7) {
                checkInAux.add(Calendar.DAY_OF_WEEK, 1)
                numberOfWeekendDays++
            }
        }
        return numberOfWeekendDays
    }

    private fun calculateNumberOfWeekDays(): Int {
        var numberOfWeekDays = 0
        val checkInAux = checkIn
        while (checkIn.before(checkOut)) {
            if (checkIn.get(Calendar.DAY_OF_WEEK) != 1 || checkIn.get(Calendar.DAY_OF_WEEK) != 7) {
                checkInAux.add(Calendar.DAY_OF_WEEK, 1)
                numberOfWeekDays++
            }
        }
        return numberOfWeekDays
    }
}