package com.example.demo_department.service;

import com.example.demo_department.dto.request.DepartmentRequest;
import com.example.demo_department.dto.response.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse createdDepartment(DepartmentRequest departmentRequest);

    DepartmentResponse getDepartmentById(String id);

    List<DepartmentResponse> getAll();

    Object delete(String id);
}
