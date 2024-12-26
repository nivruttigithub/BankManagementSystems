package com.Bridgelabz.BankManagementSystem.Controllers;

import com.Bridgelabz.BankManagementSystem.Entity.Customer;
import com.Bridgelabz.BankManagementSystem.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/getCustomerById/{cusId}")
    public Customer getCustomerById(@PathVariable Integer cusId)
    {
        return  customerService.getCustomerById(cusId);
    }

    @GetMapping("/getAllCustomer")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }
    @PutMapping("/updateCustomerById/{cusId}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable Integer cusId)
    {
        return customerService.updateCustomerById(customer,cusId);
    }
    @DeleteMapping("/deleteCustomer/{cusId}")
    public String deleteCustomer(@PathVariable Integer cusId)
    {
        return customerService.deleteCustomerById(cusId);
    }
}
