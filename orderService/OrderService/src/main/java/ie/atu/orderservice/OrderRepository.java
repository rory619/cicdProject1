package ie.atu.orderservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findById(Long id);
}
