package ie.atu.orderservice;
import java.util.List;
public class OrderService {
    private OrderRepository orderRepository;  // Inject the repository

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
