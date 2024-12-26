package com.Bridgelabz.BankManagementSystem.Services;

import com.Bridgelabz.BankManagementSystem.Entity.Customer;
import com.Bridgelabz.BankManagementSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Integer cusId) {
        return  customerRepository.findById(cusId).get();
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer updateCustomerById(Customer correctCustomer, Integer cusId) {
        Customer customer = customerRepository.findById(cusId).get();

        if(customer.getCusId() != 0)
        {
            customer.setCusId(correctCustomer.getCusId());
        }
        if(customer.getCusName() != null)
        {
            customer.setCusName(correctCustomer.getCusName());
        }
        if(customer.getCusAddress() != null)
        {
            customer.setCusAddress(correctCustomer.getCusAddress());
        }
        if(customer.getCusEmail() != null)
        {
            customer.setCusEmail(correctCustomer.getCusEmail());
        }
        if(customer.getCusMobNo() != 0)
        {
            customer.setCusMobNo(correctCustomer.getCusMobNo());
        }
        return customerRepository.save(customer);
    }

    public String deleteCustomerById(Integer cusId) {
        customerRepository.deleteById(cusId);
        return "Customer Deleted Successfully...!";
    }
}
