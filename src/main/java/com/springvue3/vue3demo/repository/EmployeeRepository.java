package com.springvue3.vue3demo.repository;

import com.springvue3.vue3demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Employee findByEmpId(Long id);
}
