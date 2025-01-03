package ie.atu.orderservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/orders")
@RestController
@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:8082", "http://localhost:63342"})
public class OrderAPIController {

    private final OrderService orderService;

    public OrderAPIController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/")
    public String index() {
        return "Welcome to the Order Service API";
    }
}
