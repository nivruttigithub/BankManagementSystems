package com.Bridgelabz.BankManagementSystem.Repository;

import com.Bridgelabz.BankManagementSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
