
package com.example.hclhrms.Controller;

import com.example.hclhrms.entity.Employee;
import com.example.hclhrms.Service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeService;

    @GetMapping("/")
    public String welcomeMsg() {
        return "Welcome to ABES HRMS";
    }

    @GetMapping("/addemp")
    public String addEmp() {
        return employeeService.addEmp();
    }

    @GetMapping("/addempbulk")
    public String addEmpBulk() {
        return employeeService.addEmpBulk();
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp() {
        return employeeService.getEmp();
    }
}
