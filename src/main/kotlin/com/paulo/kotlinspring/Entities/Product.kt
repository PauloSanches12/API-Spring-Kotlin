package com.paulo.kotlinspring.Entities

import javax.persistence.*

@Entity(name = "product")
@Table(name = "tb_product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null,
    private val name: String,
    private val price: Double,
)