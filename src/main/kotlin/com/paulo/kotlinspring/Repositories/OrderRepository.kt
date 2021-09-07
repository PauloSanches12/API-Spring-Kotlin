package com.paulo.kotlinspring.Repositories

import com.paulo.kotlinspring.Entities.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
}