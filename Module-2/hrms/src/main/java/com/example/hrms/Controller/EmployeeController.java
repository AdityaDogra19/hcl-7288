package com.example.hrms.Controller;

import com.example.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private DemoEmployee demoemployee ;


    @GetMapping("/")
    public String Welcome(){
        return "Welcome to HRMS app";
    }
    @GetMapping("/add")
    public int sum(){
        int result = demoemployee.add(20,50);
        System.out.println("result from model="+result);
        return result;
    }
}