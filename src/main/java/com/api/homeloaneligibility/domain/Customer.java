package com.api.homeloaneligibility.domain;

public class Customer {
    private String name;
    private Double propertyValue;
    private Double income;
    private Integer creditScore;

    public Customer(String name, Double propertyValue, Double income, Integer creditScore) {
        this.name = name;
        this.propertyValue = propertyValue;
        this.income = income;
        this.creditScore = creditScore;
    }

    public boolean hasCreditScoreAbove(Integer num) {
        return creditScore > num;
    }

    public boolean isCreditScoreInRange(int min, int max) {
        return creditScore >= min && creditScore <= max;
    }

    public boolean hasCreditScoreBelow(int num) {
        return creditScore < num;
    }

    public boolean hasIncomeAbove(double income) {
        return this.income > income;
    }

    public boolean isIncomeInRange(double minIncome, double maxIncome) {
        return this.income > minIncome && this.income < maxIncome;
    }

    public boolean hasIncomeBelow(double income) {
        return this.income < income;
    }

}
