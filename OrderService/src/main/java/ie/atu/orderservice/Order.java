package ie.atu.orderservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;      // Book ID (foreign key)
    private Long customerId;  // Customer ID (foreign key)
    private int quantity;     // Quantity of the book in the order

    // Constructor with parameters
    public Order() {}

    public Order(Long id, Long bookId, Long customerId, int quantity) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
