package ie.atu.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer existingCustomer = customerRepository.findById(id).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setName(customerDetails.getName());
            existingCustomer.setEmail(customerDetails.getEmail());

            return customerRepository.save(existingCustomer);
        }
        return null;
    }


    public void deleteCustomerById(Long id) {
        Customer existingCustomer = customerRepository.findById(id).orElse(null);
        if (existingCustomer != null) {
            customerRepository.delete(existingCustomer);
        }
    }
}