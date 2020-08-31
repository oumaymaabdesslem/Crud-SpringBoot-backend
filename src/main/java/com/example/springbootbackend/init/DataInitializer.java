package com.example.springbootbackend.init;

import com.example.springbootbackend.DAO.EmployeeRepository;
import com.example.springbootbackend.Entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
/*
      employeeRepository.save(Employee.builder().firstname("oumayma").lastname("abdesslem").email("mayma@gmail.com").build());
      employeeRepository.save(Employee.builder().firstname("yesser").lastname("mohamed").email("mohamed@gmail.com").build());
*/

    }
}
