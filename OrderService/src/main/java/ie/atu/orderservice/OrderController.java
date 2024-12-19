package ie.atu.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {/*
    private List<Order> orders = new ArrayList<>(Arrays.asList(
            new Order("1", "1", "1", 2),
            new Order("2", "2", "1", 3)
    ));

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }*/
}