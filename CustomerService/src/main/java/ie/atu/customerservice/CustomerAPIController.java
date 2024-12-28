package ie.atu.customerservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = {"http://localhost:8082", "http://localhost:8083", "http://localhost:63342"})
public class CustomerAPIController {

    private final CustomerService customerService;


    public CustomerAPIController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/")
    public String index() {
        return "Welcome to the Customer Service API";
    }
}