package com.enterprice.appMart.service;

import com.enterprice.appMart.model.CustomerModel;
import com.enterprice.appMart.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public CustomerModel saveCustomer(CustomerModel customerModel){
        return customerRepository.save(customerModel);
    }
    public List<CustomerModel> getAllCustomer(){
        return customerRepository.findAll();
    }
}
