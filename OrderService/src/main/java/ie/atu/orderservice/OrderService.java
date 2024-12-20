package ie.atu.orderservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Marks this class as a service bean
public class OrderService {
    private final OrderRepository orderRepository;

    // Constructor-based injection of OrderRepository
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}