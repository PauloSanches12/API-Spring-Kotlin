package com.paulo.kotlinspring.Controllers

import com.paulo.kotlinspring.Entities.Order
import com.paulo.kotlinspring.Repositories.OrderRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderController(private val repository: OrderRepository) {
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Order> {
        val objeto: Order = repository.findById(id).get()
        return ResponseEntity.ok(objeto)
    }
}