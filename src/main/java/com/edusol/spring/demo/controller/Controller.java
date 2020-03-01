package com.edusol.spring.demo.controller;


import com.edusol.spring.demo.dto.Customer;
import com.edusol.spring.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
