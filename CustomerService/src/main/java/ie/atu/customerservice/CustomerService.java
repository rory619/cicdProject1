package ie.atu.customerservice;

import java.util.List;

public class CustomerService {
    private CustomerRepository customerRepository;  // Inject the repository

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();  // Fetch all books from the database
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);  // Find a book by its ID
    }
}
