package com.dobreadrianaliatema5.dobreadrianaliatema5.service;

import com.dobreadrianaliatema5.dobreadrianaliatema5.dto.CustomerDTO;
import com.dobreadrianaliatema5.dobreadrianaliatema5.mapper.CustomerMapper;
import com.dobreadrianaliatema5.dobreadrianaliatema5.model.Customer;
import com.dobreadrianaliatema5.dobreadrianaliatema5.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public List<CustomerDTO> getCustomersDTO(){
        return customerRepository.findAll().stream()
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    //am pus CustomerDTO si nu List<CustomerDTO>, deoarece la mine username-ul este unic
    public CustomerDTO getCustomerByUsername(String username){
        List<CustomerDTO> customersDTO = new ArrayList<>();
        customersDTO = customerRepository.findAll().stream()
                     .filter(customer -> (Objects.equals(customer.getUsername(), username)))
                     .map(customerMapper::toCustomerDTO)
                     .collect(Collectors.toList());
        return customersDTO.get(0);
    }

    public List<CustomerDTO> getCustomersByCity(String city) {
        return customerRepository.findAll().stream()
                .filter(customer -> (Objects.equals(customer.getCity(), city)))
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public List<CustomerDTO> getCustomersByCountry(String country) {
        return customerRepository.findAll().stream()
                .filter(customer -> (Objects.equals(customer.getCountry(), country)))
                .map(customerMapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    public Customer getById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
