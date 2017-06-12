package webmvc.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webmvc.demo3.entity.Orders;
import webmvc.demo3.repositories.OrderRepository;

import java.util.List;

/**
 * Created by tuananh on 06/12/17.
 */
@Controller
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value = "/orders")
    public String showOrdersList(Model model) {
        List<Orders> ordersList =
                (List<Orders>) orderRepository.findAll();
        model.addAttribute("ordersList", ordersList);
        return "demo3/orders";
    }

    // localhost:8080/orderItem?orderId=1122
    @RequestMapping(value = "/orderItem")
    public String showOrderItem(@RequestParam(name = "orderId")
                                        String orderId, Model model) {
        Orders orders = orderRepository.findOne(Integer.valueOf(orderId));
        model.addAttribute("orderItemList", orders.getOrderItemList());
        return "demo3/orderItems";
    }
}
