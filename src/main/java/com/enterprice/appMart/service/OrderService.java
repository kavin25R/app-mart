package com.enterprice.appMart.service;

import com.enterprice.appMart.model.CustomerModel;
import com.enterprice.appMart.model.OrderModel;
import com.enterprice.appMart.model.ProductModel;
import com.enterprice.appMart.repository.*;
import org.springframework.stereotype.Service;

import java.awt.color.CMMException;
import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    //public OrderService(){}
    public OrderService(OrderRepository orderRepository,
                        ProductRepository productRepository,
                        CustomerRepository customerRepository){
        this.orderRepository=orderRepository;
        this.customerRepository=customerRepository;
        this.productRepository=productRepository;
    }
    public OrderModel saveOrder(Long c_id,Long p_id,int quantity){
        CustomerModel customerModel=customerRepository.findById(c_id).orElseThrow();
        ProductModel productModel=productRepository.findById(p_id).orElseThrow();
        OrderModel order;
        return orderRepository.save(order);
    }
    /*public OrderModel saveOrder(OrderModel orderModel){
        return orderRepository.save(orderModel);
    }*/
    public List<OrderModel> getAllOrder(){
        return orderRepository.findAll();
    }
}
