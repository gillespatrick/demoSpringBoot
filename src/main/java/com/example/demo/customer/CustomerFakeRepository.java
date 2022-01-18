package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository (value = "fake")
public class CustomerFakeRepository implements CustomerRepo  {


    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Gilles ", "password123"),
                new Customer(2L," Patrick", "password123"),
                new Customer(3L," Ngondo", "password123")

        );
    }
}
