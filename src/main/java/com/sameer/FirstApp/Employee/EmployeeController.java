package com.sameer.FirstApp.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employee")
    public List<EmployeeRepository.Employee> getEmployee(){
        return employeeService.getEmployee();
    }
    @RequestMapping("/employee/{id}")
    public EmployeeRepository.Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/employee")
    public void addEmployee(@RequestBody EmployeeRepository.Employee employee) {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/employee/{id}")
    public void updateEmployee(@RequestBody EmployeeRepository.Employee employee, @PathVariable String id) {
        employeeService.updateEmployee(employee,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/employee/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

}
