package com.Bridgelabz.BankManagementSystem.Services;

import com.Bridgelabz.BankManagementSystem.Entity.Account;
import com.Bridgelabz.BankManagementSystem.Entity.Employee;
import com.Bridgelabz.BankManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Integer empId) {
        return employeeRepository.findById(empId).get();
    }

    public List<Employee> getAllEmployee() {
        return  employeeRepository.findAll();
    }

    public void deleteEmpById(Integer empId) {
        employeeRepository.deleteById(empId);
    }


    public Employee updateEmployeeById(Employee correctEmloyee, Integer empId) {
        Employee employee = employeeRepository.findById(empId).get();
        if(employee.getEmpId() != 0)
        {
            employee.setEmpId(correctEmloyee.getEmpId());
        }
        if(employee.getEmpName() != null)
        {
            employee.setEmpName(correctEmloyee.getEmpName());
        }
        if(employee.getEmpEmail() != null)
        {
            employee.setEmpName(correctEmloyee.getEmpName());
        }
        if(employee.getEmpAddress() != null)
        {
            employee.setEmpAddress(correctEmloyee.getEmpAddress());
        }
        return employeeRepository.save(employee);
    }
}
