package com.dobreadrianaliatema5.dobreadrianaliatema5.controller;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CustomerDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Customer;
import com.dobreadrianaliatema5.dobreadrianaliatema5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/username")
    public CustomerDTO getAllCustomersByUsername(@RequestParam String username) {
        return customerService.getCustomerByUsername(username);
    }

    @GetMapping("/city")
    public List<CustomerDTO> getAllCustomersByCity(@RequestParam String city) {
        return customerService.getCustomersByCity(city);
    }

    @GetMapping("/country")
    public List<CustomerDTO> getAllCustomersByCountry(@RequestParam String country) {
        return customerService.getCustomersByCountry(country);
    }

    @GetMapping("/dto")
    public List<CustomerDTO> getCustomersDTO() {
        return customerService.getCustomersDTO();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @PostMapping
    public Customer insertCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteById(id);
    }
}
