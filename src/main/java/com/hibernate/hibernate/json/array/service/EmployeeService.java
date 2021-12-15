package com.hibernate.hibernate.json.array.service;

import com.hibernate.hibernate.json.array.model.Employee;
import com.hibernate.hibernate.json.array.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addNewEmployee(Employee employeeToAdd) {

        return employeeRepository.save(employeeToAdd);

    }

}
