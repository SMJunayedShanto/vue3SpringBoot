package com.springvue3.vue3demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "designation")
    private String designation;

    public Employee() {

    }
}
