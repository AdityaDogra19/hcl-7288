package com.example.hclhrms.Service;

import com.example.hclhrms.entity.Employee;
import com.example.hclhrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp {
    @Autowired
    private EmpRepoImp emprepo;
    public String addEmp(){
        Employee emp1 = new Employee(200,"Rahul","FSD","JAVA","abc@gmail.com");
        return emprepo.addemp(emp1);
    }
}