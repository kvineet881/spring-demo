package com.edusol.spring.demo.service;

import com.edusol.spring.demo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService {

    public List<Customer> getCustomer()
    {
        log.info("Inside Service Class");
        log.info("Getting Customer Data");
        List<Customer> cust= new ArrayList<>();
        cust.add( new Customer(1,"Vineet Kumar","Pune"));
        cust.add( new Customer(2,"Anurag Kumar","Pune"));
        cust.add( new Customer(3,"Umesh Kumar","Pune"));
        cust.add( new Customer(4,"Ajay Kumar","Pune"));
        cust.add( new Customer(5,"Anil Kumar","Pune"));

        return  cust;
    }
}
