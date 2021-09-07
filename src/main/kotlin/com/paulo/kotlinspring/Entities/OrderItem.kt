package com.paulo.kotlinspring.Entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity(name = "orderItem")
data class OrderItem (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null,
    private val quantity: Int,
    private val price: Double,

    @ManyToOne
    @JoinColumn(name = "product_id")
    private val product: Product,

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private val order: Order,
) {
    fun getSubTotal(): Double {
        return quantity * price
    }
}
