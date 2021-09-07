package com.paulo.kotlinspring.Controllers

import com.paulo.kotlinspring.Entities.OrderItem
import com.paulo.kotlinspring.Repositories.OrderItemRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orderItem")
class OrderItemController(private val repository: OrderItemRepository) {
    @GetMapping("/{idValue}")
    fun findByIdSub(@PathVariable idValue: Long): ResponseEntity<OrderItem> {
        val subValueItem: OrderItem = repository.findById(idValue).get()
        return ResponseEntity.ok(subValueItem)
    }
}