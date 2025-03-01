package com.example.shoppingmall.service;

import com.example.shoppingmall.model.Customer;
import com.example.shoppingmall.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService
{
    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerById(long id){
        return customerRepository.findById(id);
    }


}
