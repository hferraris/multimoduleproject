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
@RequestMapping("/api")
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
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
           // return empList;
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{lastName}")
    public List<Employee> getEmployee(@PathVariable String lastName){
       // return empList.stream().filter(emp -> emp.getLastName().equals(lastName)).collect(Collectors.toList());
        return employeeRepository.findByLastName(lastName);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        /*empList.add(employee);
        return empList;*/
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        employeeRepository.delete(employee);
    }
}
