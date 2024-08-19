package com.employeeCrudApp.employee.controller;

import com.employeeCrudApp.employee.entity.Employee;
import com.employeeCrudApp.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("./api")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

    private final EmployeeService employeeService;

    public Employee postEmployee(@RequestBody Employee employee){

        return employeeService.postEmployee(employee);

    }

}
