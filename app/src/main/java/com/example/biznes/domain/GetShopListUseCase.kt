package com.example.biznes.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
       return shopListRepository.getShopList()
    }
}