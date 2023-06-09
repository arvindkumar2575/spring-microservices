package com.arvindkumar2575.department.controller;

import com.arvindkumar2575.department.entity.Department;
import com.arvindkumar2575.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside of saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside of findDepartmentById of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
