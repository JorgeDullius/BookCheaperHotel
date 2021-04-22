package com.jorge.hotels.Hotel

import com.jorge.hotels.ClientType

abstract class Hotel {
    abstract val starRating: Int
    abstract val name: String
    abstract val weekDayPrice: Float
    abstract val weekendDayPrice: Float
    abstract val weekDayPriceForRewardsClients: Float
    abstract val weekendDayPriceForRewardsClients: Float

    fun calculateDayPrice(
        clientType: ClientType,
        numberOfWeekendDays: Int,
        numberOfWeekDays: Int
    ): Float {
        return when (clientType) {
            is ClientType.Regular -> (numberOfWeekDays * weekDayPrice) +
                    (numberOfWeekendDays * weekendDayPrice)
            is ClientType.Reward -> (numberOfWeekDays * weekDayPriceForRewardsClients) +
                    (numberOfWeekendDays * weekendDayPriceForRewardsClients)
        }
    }
}