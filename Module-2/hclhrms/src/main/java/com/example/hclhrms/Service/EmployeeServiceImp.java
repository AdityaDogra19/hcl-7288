
package com.example.hclhrms.Service;

import com.example.hclhrms.entity.Employee;
import com.example.hclhrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImp {

    @Autowired
    private EmpRepoImp empRepo;

    public String addEmp() {
        Employee emp = new Employee(
                200, "Akshat", "Developer",
                "Java", "jassu@gmail.com"
        );

        return empRepo.addEmp(emp);
    }

    public String addEmpBulk() {
        List<Employee> bulkEmp = Arrays.asList(
                new Employee(201, "Rahul", "Tester",
                        "Java", "rahul@gmail.com"),
                new Employee(202, "Priya", "Developer",
                        "Spring Boot", "priya@gmail.com"),
                new Employee(203, "Aman", "Backend Developer",
                        "Java", "aman@gmail.com"),
                new Employee(204, "Neha", "Frontend Developer",
                        "React", "neha@gmail.com")
        );

        for (Employee emp : bulkEmp) {
            empRepo.addEmp(emp);
        }

        return "Bulk employees added successfully";
    }

    public List<Employee> getEmp() {
        return empRepo.getEmp();
    }
}
