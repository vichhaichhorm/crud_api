package com.example.demo_department.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity(name = "department_tb") // persist class Department as table to database postgres
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id // use id for primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String departmentName;
    private String description;
    private Date createdAt;
}
