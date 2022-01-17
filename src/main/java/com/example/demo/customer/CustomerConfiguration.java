package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.userFakeCustomerRepo:false}")
    private boolean userFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Super jeu");
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("userFakeCustomerRepo "+userFakeCustomerRepo);
        return userFakeCustomerRepo?
                new CustomerFakeRepository():
                new CustomerRepository();
    }
}
