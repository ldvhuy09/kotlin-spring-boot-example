package com.sezi.sample.sample.controller

import com.sezi.sample.sample.model.Customer
import com.sezi.sample.sample.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController {
    @Autowired
    lateinit var repository: CustomerRepository

    @GetMapping("/save")
    fun save(): String {
        repository.save(Customer("Huy", "Le"))
        repository.save(Customer("Huy", "Ha"))
        repository.save(Customer("Chuot", "Cho"))
        return "Done"
    }

    @GetMapping("/customers")
    fun findAllCustomer() = repository.findAll()
}