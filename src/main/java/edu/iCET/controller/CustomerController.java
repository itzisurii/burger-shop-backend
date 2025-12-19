package edu.iCET.controller;

import edu.iCET.model.dto.CustomerDTO;
import edu.iCET.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String testAPI(){

        return "Customer controller called";

    }

    @PostMapping("save")
    public void save(@RequestBody CustomerDTO customerDTO){

    }


}
