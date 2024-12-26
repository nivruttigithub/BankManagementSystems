package com.Bridgelabz.BankManagementSystem.Controllers;

import com.Bridgelabz.BankManagementSystem.Entity.Account;
import com.Bridgelabz.BankManagementSystem.Entity.Employee;
import com.Bridgelabz.BankManagementSystem.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/addEmp")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmpById/{empId}")
    public Employee getEmployee(@PathVariable Integer empId)
    {
     return employeeService.getEmployeeById(empId);
    }

    @GetMapping("/getAllEmp")
    public List<Employee> getAllEmployee()
        {
           return  employeeService.getAllEmployee();
        }

        @DeleteMapping("/deleteEmpById/{empId}")
        public String deleteEmployee(@PathVariable Integer empId)
        {
            employeeService.deleteEmpById(empId);
            return "Employee Deleted Successfully...!";
        }

        @PutMapping("/updateEmpById/{empId}")
        public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer empId)
        {
            return employeeService.updateEmployeeById(employee,empId);
        }

}
