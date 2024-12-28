package ie.atu.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;




    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get an order
    public Order getOrderById(Long id) {

        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order updateOrder(Long id, Order orderDetails) {
        Order order = getOrderById(id);
        if (order == null) {
            return null;
        }
        order.setBookId(orderDetails.getBookId());
        order.setCustomerId(orderDetails.getCustomerId());
        order.setQuantity(orderDetails.getQuantity());
        return orderRepository.save(order);
    }



    public ResponseEntity<Void> deleteOrderById(Long id) {
        if (!orderRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        orderRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}