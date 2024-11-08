package com.example.demo_department.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DepartmentResponse {
    private String id;
    private String departmentName;
    private String description;
    private Date createdAt;
}
