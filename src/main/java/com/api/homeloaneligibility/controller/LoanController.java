package com.api.homeloaneligibility.controller;

import com.api.homeloaneligibility.controller.dto.CustomerLoanInput;
import com.api.homeloaneligibility.controller.dto.CustomerLoanResponse;
import com.api.homeloaneligibility.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loan")
    public ResponseEntity<CustomerLoanResponse> isLoanAvailable(@RequestBody CustomerLoanInput customerInput) {
        var loanResponse = loanService.checkLoanAvailiability(customerInput);
        return ResponseEntity.ok(loanResponse);
    }
}
