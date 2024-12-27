package ie.atu.orderservice;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookId;
    private Long customerId;
    private int quantity;


    public Order() {}

    public Order(Long id, String bookId, Long customerId, int quantity) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getBookId() {

        return bookId;
    }

    public void setBookId(String bookId) {

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
