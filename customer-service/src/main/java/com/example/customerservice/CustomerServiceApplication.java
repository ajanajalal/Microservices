package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args->{
			customerRepository.save(new Customer(null,"Mohammed","mohammed@email.com"));
			customerRepository.save(new Customer(null,"yassine","yassine@email.com"));
			customerRepository.save(new Customer(null,"jamal","jamal@email.com"));
			customerRepository.findAll().forEach(customer -> System.out.println(customer.getName()));
		};
	}

}
