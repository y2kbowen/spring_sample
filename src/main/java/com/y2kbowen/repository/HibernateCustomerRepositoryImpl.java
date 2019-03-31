package com.y2kbowen.repository;

import com.y2kbowen.model.Customer;
import javafx.scene.control.CustomMenuItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
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
