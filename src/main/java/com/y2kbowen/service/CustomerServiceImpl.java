package com.y2kbowen.service;

import com.y2kbowen.model.Customer;
import com.y2kbowen.repository.CustomerRepository;
import com.y2kbowen.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = null;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
