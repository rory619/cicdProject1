package ie.atu.orderservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:63342")
public class OrderController {

    private final OrderService orderService;

    // Constructor injection for OrderService
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String index() {
        return "index"; // Serve index.html from static resources
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders(); // Call the method on the injected instance
    }
}