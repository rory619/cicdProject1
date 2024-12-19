package ie.atu.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  /*  private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("1", "Alice", "alice@example.com"),
            new Customer("2", "Bob", "bob@example.com")
    ));

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }*/
}

