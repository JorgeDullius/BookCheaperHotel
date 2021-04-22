package com.jorge.hotels.Hotel

class BotanicalParkHotel: Hotel() {
    override val starRating: Int
        get() = 4
    override val name: String
        get() = "Parque Botânico"
    override val weekDayPrice: Float
        get() = 160f
    override val weekendDayPrice: Float
        get() = 60f
    override val weekDayPriceForRewardsClients: Float
        get() = 110f
    override val weekendDayPriceForRewardsClients: Float
        get() = 50f
}