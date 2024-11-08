package com.example.demo_department.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    private String departmentName;
    private String description;
    private Date createdAt;
}
