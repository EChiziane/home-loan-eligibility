package com.api.homeloaneligibility.controller.dto;

import java.util.List;

public record CustomerLoanResponse(String customer, List<LoanResponse> loans) {
}
