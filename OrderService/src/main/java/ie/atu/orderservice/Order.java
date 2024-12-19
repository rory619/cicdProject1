package ie.atu.orderservice;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
@Entity
@Table(name = "Table_1")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String bookId;
    private int quantity;

    // No-argument constructor for JPA
    public Order() {
    }

    // Constructor with arguments
    public Order(long id, String customerId, String bookId, int quantity) {
        this.id = id;
        this.customerId = customerId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    // Getter and Setter for 'id'


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for 'customerId'
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Getter and Setter for 'bookId'
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    // Getter and Setter for 'quantity'
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
