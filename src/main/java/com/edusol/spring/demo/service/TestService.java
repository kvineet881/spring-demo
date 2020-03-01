package com.edusol.spring.demo.service;

import com.edusol.spring.demo.dto.Customer;
import com.edusol.spring.demo.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Customer> getCustomer() {
        log.info("Inside Service Class");
        log.info("Getting Customer Data");

        return testRepository.getCustomers();
    }

    public void addCustomerService(Customer customer) {

        testRepository.addCustomers(customer);
    }
    public void removeCustomerService(int id) {

        testRepository.removeCustomersById(id);
    }
}
