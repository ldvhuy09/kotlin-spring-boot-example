package com.sezi.sample.sample.controller

import com.sezi.sample.sample.model.Customer
import com.sezi.sample.sample.repository.CustomerRepository
import com.sezi.sample.sample.services.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController {
    @Autowired
    lateinit var service: CustomerService

    @GetMapping("/save")
    fun save() = service.save()

    @GetMapping("/customers")
    fun findAllCustomer() = service.findAllCustomer()
}