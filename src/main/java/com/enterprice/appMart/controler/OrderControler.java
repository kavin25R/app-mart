package com.enterprice.appMart.controler;

import com.enterprice.appMart.model.OrderModel;
import com.enterprice.appMart.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderControler {
    private final OrderService orderService;
    public OrderControler(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("/insert")
    //public OrderControler(){}
    public OrderModel saveOrder(@RequestParam Long c_id,
                                @RequestParam Long p_id,
                                @RequestParam int o_quantity){
        return orderService.saveOrder(c_id,p_id,o_quantity);
    }
    @GetMapping("/view")
    public List<OrderModel> getAllOrder(){
        return orderService.getAllOrder();
    }
}
