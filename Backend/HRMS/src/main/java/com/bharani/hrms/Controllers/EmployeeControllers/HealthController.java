package com.bharani.hrms.Controllers.EmployeeControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String Health(){
        return "Server is Working";
    }
}