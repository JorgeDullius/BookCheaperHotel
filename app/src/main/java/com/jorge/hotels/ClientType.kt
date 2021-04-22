package com.jorge.hotels

sealed class ClientType(){
    object Regular: ClientType()
    object Reward: ClientType()
}
