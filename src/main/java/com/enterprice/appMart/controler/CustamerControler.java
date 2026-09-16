package com.enterprice.appMart.controler;

import com.enterprice.appMart.model.CustomerModel;
import com.enterprice.appMart.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustamerControler {
    private CustomerService customerService;
    public CustamerControler(CustomerService customerService){
        this.customerService=customerService;
    }
    @PostMapping("/insert")
    public CustomerModel saveCustomer(@RequestBody CustomerModel customerModel){
        return customerService.saveCustomer(customerModel);
    }
    @GetMapping("/view")
    public List<CustomerModel> getAllCustomer(){

        return customerService.getAllCustomer();
    }
}
