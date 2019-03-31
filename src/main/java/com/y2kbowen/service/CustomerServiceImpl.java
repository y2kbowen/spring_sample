package com.y2kbowen.service;

import com.y2kbowen.model.Customer;
import com.y2kbowen.repository.CustomerRepository;
import com.y2kbowen.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }




    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
