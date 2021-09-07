package com.paulo.kotlinspring.Repositories

import com.paulo.kotlinspring.Entities.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
}