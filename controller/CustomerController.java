package com.example.shoppingmall.controller;

import com.example.shoppingmall.model.Customer;
import com.example.shoppingmall.service.CustomerService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody  Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/getCustomerById/{id}")  // Path variable
    public Customer getCustomerById(@PathVariable Long id) {  // Corrected parameter
        return customerService.getCustomerById( id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

}
