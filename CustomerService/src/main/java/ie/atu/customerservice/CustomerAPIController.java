package ie.atu.customerservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = {"http://localhost:8082", "http://localhost:8083"}) // Replace with your frontend's URL
public class CustomerAPIController {

    private final CustomerService customerService;

    // Constructor injection for CustomerService
    public CustomerAPIController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Endpoint to retrieve all customers.
     *
     * @return List of customers
     */
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers(); // Fetch customers from the service layer
    }

    /**
     * Endpoint to retrieve a welcome message (optional).
     *
     * @return Welcome message string
     */
    @GetMapping("/")
    public String index() {
        return "Welcome to the Customer Service API";
    }
}