package com.dg.app.main;

import com.dg.app.service.EmployeeRepository;
import com.dg.app.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBPopulate implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

   @Autowired
    public DBPopulate(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("insert begin here..");
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("hazel", "ferraris", "alvarez"));
        empList.add(new Employee("geon kylo", "ferraris", "alvarez"));
        empList.add(new Employee("dhan benito", "ferraris", "alvarez"));
        empList.add(new Employee("sheril", "talde", "alvarez"));
        employeeRepository.saveAll(empList);
    }
}
