package com.y2kbowen.repository;

import com.y2kbowen.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
