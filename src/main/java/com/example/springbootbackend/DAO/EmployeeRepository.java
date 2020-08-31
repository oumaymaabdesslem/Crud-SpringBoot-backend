package com.example.springbootbackend.DAO;

import com.example.springbootbackend.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository< Employee,Integer> {
}
