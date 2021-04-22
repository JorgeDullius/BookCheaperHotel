package com.jorge.hotels.Hotel

class FlowerParkHotel: Hotel() {
    override val starRating: Int
        get() = 3
    override val name: String
        get() = "Parque das flores"
    override val weekDayPrice: Float
        get() = 110f
    override val weekendDayPrice: Float
        get() = 90f
    override val weekDayPriceForRewardsClients: Float
        get() = 80f
    override val weekendDayPriceForRewardsClients: Float
        get() = 80f
}