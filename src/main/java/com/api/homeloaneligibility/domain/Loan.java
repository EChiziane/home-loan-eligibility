package com.api.homeloaneligibility.domain;

public class Loan {

    private final Customer customer;

    public Loan(Customer customer) {

        this.customer = customer;
    }

    public boolean isFN80Available() {
        return customer.hasCreditScoreAbove(700) && customer.hasIncomeAbove(5000);
    }

    public boolean isFN60Available() {
        return customer.isCreditScoreInRange(600, 700) && customer.isIncomeInRange(3000, 5000);
    }

    public boolean isNONEAvailable() {
        return customer.hasCreditScoreBelow(600) && customer.hasIncomeBelow(3000);
    }
}
