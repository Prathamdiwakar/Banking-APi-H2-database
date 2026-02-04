package com.example.banking_api.customerController;

import com.example.banking_api.Customer.Customer;
import com.example.banking_api.customerService.CustomerServices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/customers")
public class CustomerControlller {
    private final CustomerServices customerServices;


    public CustomerControlller(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }
    @GetMapping
    public ResponseEntity<List<Customer>> getALlCustomers() {
        return ResponseEntity.ok(customerServices.getAllCustomers());

    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerServices.createCustomer(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> GetById(@PathVariable Long id) {
       return ResponseEntity.ok(customerServices.getCustomerById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> UpdateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        try{
          return ResponseEntity.ok(customerServices.updateCustomer(id, customer));

        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<String> DeleteCustomer(@PathVariable Long id) {
        try{
            customerServices.deleteCustomer(id);
            return ResponseEntity.ok("Customer deleted successfully");
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
