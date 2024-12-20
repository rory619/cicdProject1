package ie.atu.orderservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class OrderAPIController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/api/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders(); // Get all orders from the service layer
    }
}
