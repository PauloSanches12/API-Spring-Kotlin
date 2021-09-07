package com.paulo.kotlinspring.Entities

import javax.persistence.*

@Entity(name = "Order")
@Table(name = "tb_order")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    private var moment: String,
    private val status: OrderStatus,

    @ManyToOne
    @JoinColumn(name = "client_id")
    private val client: Client,

    @OneToMany(mappedBy = "order")
    private val items: List<OrderItem> = ArrayList()
) {
    fun getTotal(): Double {
        var sum = 0.0

        for (item: OrderItem in items) {
            sum += item.getSubTotal()
        }
        return sum
    }
}