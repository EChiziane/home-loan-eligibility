package com.api.homeloaneligibility.controller.dto;

import com.api.homeloaneligibility.domain.Customer;

public record CustomerLoanInput(String name, Double income, Integer credit_score, Double property_value) {

    public Customer toCustomer() {

        Customer customer = new Customer(name, property_value, income, credit_score) {

        };
        return customer;
    }

}
