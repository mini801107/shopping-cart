package io.kraftsman

import io.kraftsman.dtos.Product

class ShoppingCart {
    private val products = mutableListOf<Product>()
    fun add(product: io.kraftsman.dtos.Product) {
        products.add(product)
    }

    fun totalPrice(): Int {
        return products.sumOf { it.price }
    }

    fun count(): Int {
        return products.count()
    }
}
