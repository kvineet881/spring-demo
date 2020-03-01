package com.edusol.spring.demo.controller;


import com.edusol.spring.demo.dto.Customer;
import com.edusol.spring.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/")
@RequestMapping("/edu")
@Slf4j
public class Controller {
    @Autowired
    private TestService testService;

    @GetMapping("/get")
    public List<Customer> homePage() {
        log.info("Inside the Controller");
        return testService.getCustomer();
    }

    @PostMapping("/submit")
    public void addCustomer(@RequestBody Customer customer) {

        testService.addCustomerService(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void removeCustomer(@PathVariable("id") int id) {
        log.info("Deleted id :"+id);
        testService.removeCustomerService(id);
    }


}
