package com.homework25.homework25.controller;

import com.homework25.homework25.Employee;
import com.homework25.homework25.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
   private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/delete")
    public Employee deleteEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.deleteEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }
}
