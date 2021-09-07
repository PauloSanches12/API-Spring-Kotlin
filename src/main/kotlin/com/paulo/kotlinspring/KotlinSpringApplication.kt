package com.paulo.kotlinspring

import com.paulo.kotlinspring.Entities.*
import com.paulo.kotlinspring.Repositories.ClientRepository
import com.paulo.kotlinspring.Repositories.OrderItemRepository
import com.paulo.kotlinspring.Repositories.OrderRepository
import com.paulo.kotlinspring.Repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class KotlinSpringApplication: CommandLineRunner {

    @Autowired
    private val clientRepository: ClientRepository? = null

    @Autowired
    private val productRepository: ProductRepository? = null

    @Autowired
    private val orderRepository: OrderRepository? = null

    @Autowired
    private val orderItemRepository: OrderItemRepository? = null


    override fun run(vararg args: String?)  {
        val client1 = Client(null, "Julio Cesar", "julio@gmail.com")
        val client2 = Client(null, "Paulo Sergio", "paulo@gmail.com")

        val order1 = Order(null, "2021-04-18T11:25:09Z", OrderStatus.PAID, client1)
        val order2 = Order(null, "2021-04-20T13:30:00Z", OrderStatus.WAITING, client2)

        val product1 = Product(null, "Playstation 5", 5000.0)
        val product2 = Product(null, "Xbox Series X", 4800.0)
        val product3 = Product(null, "Nintendo Switch", 2899.0)

        val item1 = OrderItem(null,1, 5000.0,product1, order1)
        val item2 = OrderItem(null,2, 4800.0,product2, order1)
        val item3 = OrderItem(null,3, 4800.0,product2, order2)
        val item4 = OrderItem(null,4, 2899.0,product3, order2)

        productRepository?.saveAll(Arrays.asList(product1,product2,product3))
        clientRepository?.saveAll(Arrays.asList(client1, client2))
        orderRepository?.saveAll(Arrays.asList(order1, order2))
        orderItemRepository?.saveAll(Arrays.asList(item1, item2, item3, item4))
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinSpringApplication>(*args)
}
