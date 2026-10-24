package com.example.hclhrms.repository;

import com.example.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class EmpRepoImp implements EmployeeRepo{

    List<Employee> empList = new ArrayList<>();

    @Override
    public String addEmp(Employee emp) {
        empList.add(emp);
        return "Employee added successfully";
    }

    @Override
    public String addEmpBulk(List<Employee> bulkEmp) {
        empList.addAll(bulkEmp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        return empList;
    }

    @Override
    public Employee getEmpById(long empId) {
        return empList.stream().filter(e -> e.getEmp_id() == empId).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empId) {
        return "";
    }

    @Override
    public String updateById(long empId, Employee updatedEmp) {
        return "";
    }
}