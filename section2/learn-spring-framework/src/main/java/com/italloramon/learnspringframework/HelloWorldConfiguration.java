package com.italloramon.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, Integer age, Address address) { };
record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {
    @Bean(name = "myName")
    public String name() {
        return "Ramon";
    }

    @Bean
    public Integer age() {
        return 21;
    }

    @Bean
    @Primary
    public Person person() {
        return new Person("Ravi", 1, new Address("Main Street", "London"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, Integer age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("São Gonçalo", "Brazil");
    }
}
