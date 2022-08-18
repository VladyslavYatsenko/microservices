package com.yatsenko.department.controller;

import com.yatsenko.department.entity.Department;
import com.yatsenko.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

  private final DepartmentService departmentService;

  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department) {
    log.info("Post department controller,saving department");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{departmentId}")
  public Department findById(@PathVariable Long departmentId){
    log.info("Get department controller,get department by id");
    return departmentService.findById(departmentId);
  }
}
