package com.sezi.sample.sample.services

import com.sezi.sample.sample.model.Customer
import org.springframework.stereotype.Service

interface CustomerService {
    public fun save(): String
    public fun findAllCustomer(): Iterable<Customer>
}