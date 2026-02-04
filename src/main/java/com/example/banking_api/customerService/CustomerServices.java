package com.example.banking_api.customerService;

import com.example.banking_api.Customer.Customer;
import com.example.banking_api.customerRepo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {
    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
       return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    public Customer updateCustomer(Long id, Customer updatedcustomer) {
        return customerRepository.findById(id).map(existing-> {
            existing.setFirstName(updatedcustomer.getFirstName());
            existing.setLastName(updatedcustomer.getLastName());
            existing.setEmail(updatedcustomer.getEmail());
            existing.setPhoneNumber(updatedcustomer.getPhoneNumber());
            return customerRepository.save(existing);
        }).orElseThrow(()-> new RuntimeException("Customer not found"));
    }

    public void deleteCustomer(Long id) {
        if(!customerRepository.existsById(id)) {
            throw new RuntimeException("Customer not found" +id);
        }
        customerRepository.deleteById(id);
    }
}
