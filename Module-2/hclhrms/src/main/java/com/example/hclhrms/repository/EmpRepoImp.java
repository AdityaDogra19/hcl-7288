
package com.example.hclhrms.repository;

import com.example.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepoImp {

    private final List<Employee> employees = new ArrayList<>();

    public String addEmp(Employee employee) {
        boolean exists = employees.stream()
                .anyMatch(e -> e.getEmp_id() == employee.getEmp_id());

        if (exists) {
            return "Employee already exists";
        }

        employees.add(employee);
        return "Employee added successfully";
    }

    public List<Employee> getEmp() {
        return new ArrayList<>(employees);
    }
}
