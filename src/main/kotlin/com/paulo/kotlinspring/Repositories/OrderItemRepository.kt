package com.paulo.kotlinspring.Repositories

import com.paulo.kotlinspring.Entities.OrderItem
import org.springframework.data.jpa.repository.JpaRepository

interface OrderItemRepository: JpaRepository<OrderItem, Long> {
}