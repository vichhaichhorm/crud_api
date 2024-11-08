package com.example.demo_department.controller;

import com.example.demo_department.dto.request.DepartmentRequest;
import com.example.demo_department.dto.response.DepartmentResponse;
import com.example.demo_department.modal.Department;
import com.example.demo_department.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/create/department")
    public ResponseEntity<?> createdDepartment(
            @RequestBody DepartmentRequest departmentRequest
            ){
        DepartmentResponse departmentResponse = departmentService.createdDepartment(departmentRequest);
        return ResponseEntity.ok(departmentResponse);
    }

    @GetMapping("/get/departmentById/{id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable String id){
        DepartmentResponse departmentResponse = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(departmentResponse);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll(){
        List<DepartmentResponse> departmentResponse = departmentService.getAll();
        return ResponseEntity.ok(departmentResponse);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        return ResponseEntity.ok(departmentService.delete(id));
    }

}
