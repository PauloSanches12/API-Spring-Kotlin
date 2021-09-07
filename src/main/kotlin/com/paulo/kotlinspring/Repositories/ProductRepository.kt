package com.paulo.kotlinspring.Repositories

import com.paulo.kotlinspring.Entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
}