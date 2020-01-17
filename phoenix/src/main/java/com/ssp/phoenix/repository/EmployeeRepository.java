package com.ssp.phoenix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssp.phoenix.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
