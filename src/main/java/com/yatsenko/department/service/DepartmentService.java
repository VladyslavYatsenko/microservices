package com.yatsenko.department.service;

import com.yatsenko.department.entity.Department;
import com.yatsenko.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {

  private final DepartmentRepository departmentRepository;

  public Department saveDepartment(Department department) {
    log.info("Saving department -> {} ", department);
    return departmentRepository.save(department);
  }

  public Department findById(Long departmentId) {
    log.info("Getting department by id -> {} ", departmentId);
    return departmentRepository.findById(departmentId).orElseThrow(
        () -> new IllegalArgumentException("Department with id: " + departmentId + " not found"));
  }
}
