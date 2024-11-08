package com.example.demo_department.service.serviceImp;

import com.example.demo_department.dto.request.DepartmentRequest;
import com.example.demo_department.dto.response.DepartmentResponse;
import com.example.demo_department.modal.Department;
import com.example.demo_department.repository.DepartmentRepository;
import com.example.demo_department.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class DepartmentServiceImp implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    @Override
    public DepartmentResponse createdDepartment(DepartmentRequest departmentRequest) {
        Department department = new Department();
        // set field department to input
        department.setDepartmentName(departmentRequest.getDepartmentName());
        department.setDescription(departmentRequest.getDescription());
        department.setCreatedAt(departmentRequest.getCreatedAt());

        Department savedDepartment = departmentRepository.save(department);

        // response field department to output
        DepartmentResponse departmentResponse = new DepartmentResponse();

        departmentResponse.setId(savedDepartment.getId());
        departmentResponse.setDepartmentName(savedDepartment.getDepartmentName());
        departmentResponse.setDescription(savedDepartment.getDescription());
        departmentResponse.setCreatedAt(savedDepartment.getCreatedAt());

        return departmentResponse;
    }

    @Override
    public DepartmentResponse getDepartmentById(String id) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (Objects.isNull(department)){
            System.out.println("Department with id "+id+" not found");
        }
        DepartmentResponse departmentResponse = new DepartmentResponse();

        departmentResponse.setId(Objects.requireNonNull(department).getId());
        departmentResponse.setDepartmentName(department.getDepartmentName());
        departmentResponse.setDescription(department.getDescription());
        departmentResponse.setCreatedAt(department.getCreatedAt());
        return departmentResponse;
    }

    @Override
    public List<DepartmentResponse> getAll() {
        List<Department> departmentList = departmentRepository.findAll();

        List<DepartmentResponse> departmentResponseList = new ArrayList<>();

        for (Department department: departmentList){
            DepartmentResponse departmentResponse = new DepartmentResponse();

            departmentResponse.setId(Objects.requireNonNull(department).getId());
            departmentResponse.setDepartmentName(department.getDepartmentName());
            departmentResponse.setDescription(department.getDescription());
            departmentResponse.setCreatedAt(department.getCreatedAt());

            departmentResponseList.add(departmentResponse);
        }
        return departmentResponseList;
    }

    @Override
    public Object delete(String id) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (!Objects.isNull(department)){
            departmentRepository.deleteById(id);
        }
        return "Not found .";
    }
}
