package com.jorge.hotels.Hotel

class AtlanticSeaHotel : Hotel() {
    override val starRating: Int
        get() = 5
    override val name: String
        get() = "Mar Atlântico"
    override val weekDayPrice: Float
        get() = 220f
    override val weekendDayPrice: Float
        get() = 150f
    override val weekDayPriceForRewardsClients: Float
        get() = 100f
    override val weekendDayPriceForRewardsClients: Float
        get() = 40f
}