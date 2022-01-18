package com.example.demo.customer;


import java.util.Collections;
import java.util.List;



public class CustomerRepository  implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {

        return Collections.singletonList(
                new Customer(1L,"Todo implement real db", "password123")
        );
    }
}
