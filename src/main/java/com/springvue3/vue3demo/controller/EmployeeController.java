package com.springvue3.vue3demo.controller;

import com.springvue3.vue3demo.model.Employee;
import com.springvue3.vue3demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping(value = "/save")
    public Employee save(Employee employee ){

        return employeeRepository.save(employee);
    }

}
