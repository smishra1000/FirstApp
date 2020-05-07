package com.sameer.FirstApp.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    private List<EmployeeRepository.Employee> employees = new ArrayList<>();
    public List<EmployeeRepository.Employee> getEmployee() {
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public EmployeeRepository.Employee getEmployeeById(String id) {
         return employeeRepository.findById(id).orElse(null);
    }
    public void addEmployee( EmployeeRepository.Employee employee) {
        employeeRepository.save(employee);
    }
    public void updateEmployee(EmployeeRepository.Employee employee, String id) {
        employeeRepository.save(employee);

    }

    public void deleteEmployee(String id) {
        System.out.println(id);
        employeeRepository.deleteById(id);
    }
}
