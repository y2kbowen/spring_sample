package com.y2kbowen.repository;

import com.y2kbowen.model.Customer;
import javafx.scene.control.CustomMenuItem;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();


        Customer customer = new Customer();
        customer.setFirstname("Ken");
        customer.setLastname("Bowen");

        customers.add(customer);

        return customers;

    }
}
