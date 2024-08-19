package com.employeeCrudApp.employee.service;

import com.employeeCrudApp.employee.employee.EmployeeRepository;
import com.employeeCrudApp.employee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
