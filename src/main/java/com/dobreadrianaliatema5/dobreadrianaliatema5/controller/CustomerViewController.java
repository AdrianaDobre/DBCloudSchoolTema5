package com.dobreadrianaliatema5.dobreadrianaliatema5.controller;

import com.dobreadrianaliatema5.dobreadrianaliatema5.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerViewController {
    private final CustomerService customerService;

    @GetMapping("/all")
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.getCustomersDTO());
        return "customers";
    }

    @GetMapping("{id}")
    public String getCustomerById(Model model, @PathVariable(value = "id") Integer id) {
        model.addAttribute("customers", customerService.getById(id));
        return "customers";
    }

    @GetMapping("/username")
    public String getCustomerByUsername(Model model, @RequestParam(value = "username") String username) {
        model.addAttribute("customers", customerService.getCustomerByUsername(username));
        return "customers";
    }

    @GetMapping("/city")
    public String getCustomerByCity(Model model, @RequestParam(value = "city") String city) {
        model.addAttribute("customers", customerService.getCustomersByCity(city));
        return "customers";
    }

    @GetMapping("/country")
    public String getCustomerByCountry(Model model, @RequestParam(value = "country") String country) {
        model.addAttribute("customers", customerService.getCustomersByCountry(country));
        return "customers";
    }
}
