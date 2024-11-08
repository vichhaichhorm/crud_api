package com.example.demo_department.repository;

import com.example.demo_department.modal.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {
}
