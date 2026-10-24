package com.example.hclhrms.repository;

import com.example.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface EmployeeRepo {
    String addEmp(Employee emp);
    String addEmpBulk(List<Employee> bulkEmp);
    List<Employee> getEmp();
    Employee getEmpById(long empId);
    String deleteById(long empId);
    String updateById(long empId, Employee updatedEmp);
}