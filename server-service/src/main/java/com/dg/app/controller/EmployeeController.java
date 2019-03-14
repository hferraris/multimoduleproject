package com.dg.app.controller;

import com.dg.app.domain.Employee;
import com.dg.app.service.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private List<Employee> empList;
    @Autowired
    private EmployeeRepository employeeRepository;
    //static data before using db
   /* public EmployeeController() {
        empList = new ArrayList<>();
        empList.add(new Employee("hazel", "ferraris", "alvarez"));
        empList.add(new Employee("geon kylo", "ferraris", "alvarez"));
        empList.add(new Employee("dhan benito", "ferraris", "alvarez"));
        empList.add(new Employee("sheril", "talde", "alvarez"));

    }
*/
    @GetMapping("/all")
    public List<Employee> getEmployees(){
           // return empList;
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{lastName}")
    public List<Employee> getEmployee(@PathVariable String lastName){
       // return empList.stream().filter(emp -> emp.getLastName().equals(lastName)).collect(Collectors.toList());
        return employeeRepository.findByLastName(lastName);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        /*empList.add(employee);
        return empList;*/
        return employeeRepository.save(employee);
    }
}
