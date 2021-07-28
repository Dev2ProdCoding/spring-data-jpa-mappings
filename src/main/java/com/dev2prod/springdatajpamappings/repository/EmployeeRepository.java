package com.dev2prod.springdatajpamappings.repository;

import com.dev2prod.springdatajpamappings.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
