package com.company.employee.service;

import org.springframework.data.domain.Page;

import com.company.employee.entity.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Page<Employee> getAllEmployees(int page, int size, String sortBy);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}