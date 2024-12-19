package ie.atu.orderservice;

public class Order {
    private String orderId;
    private String customerId;
    private String bookId;
    private int quantity;

    public Order(String orderId, String customerId, String bookId, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
