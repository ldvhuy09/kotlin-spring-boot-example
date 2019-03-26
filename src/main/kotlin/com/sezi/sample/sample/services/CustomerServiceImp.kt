package com.sezi.sample.sample.services

import com.sezi.sample.sample.model.Customer
import com.sezi.sample.sample.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImp : CustomerService {
    @Autowired
    lateinit var repository: CustomerRepository

    override fun save(): String {
        repository.save(Customer("Huy", "Le"))
        repository.save(Customer("Huy", "Ha"))
        repository.save(Customer("Chuot", "Cho"))
        return "done"
    }

    override fun findAllCustomer(): Iterable<Customer> {
        return repository.findAll()
    }
}