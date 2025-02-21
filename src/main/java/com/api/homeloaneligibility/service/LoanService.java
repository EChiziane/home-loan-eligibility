package com.api.homeloaneligibility.service;

import com.api.homeloaneligibility.controller.dto.CustomerLoanInput;
import com.api.homeloaneligibility.controller.dto.CustomerLoanResponse;
import com.api.homeloaneligibility.controller.dto.LoanResponse;
import com.api.homeloaneligibility.domain.Loan;
import com.api.homeloaneligibility.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailiability(CustomerLoanInput loanRequest) {
        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if (loan.isFN60Available()) {
            loans.add(new LoanResponse(LoanType.FIN60));
        }

        if (loan.isFN80Available()) {
            loans.add(new LoanResponse(LoanType.FIN80));
        }

        if (loan.isNONEAvailable()) {
            loans.add(new LoanResponse(LoanType.NONE));
        }

        return new CustomerLoanResponse(loanRequest.name(), loans);
    }
}
