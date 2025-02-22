package com.api.homeloaneligibility.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;


@ExtendWith(MockitoExtension .class)
class LoanTest {

    @Mock
    private Customer customer;
    @InjectMocks
    private Loan loan;


    @Nested
    class isFN80Available{
@Test
        void shouldBeTrueIfScoreIsBelow700kAndIncomeGreaterThan5k(){
            doReturn(true).when(customer).hasCreditScoreAbove(700);
            doReturn(true).when(customer).hasIncomeAbove(5000);
            assertTrue(loan.isFN80Available());
        }
    }



    @Nested
    class isFN60Available{
        @Test
        void shouldBeTrueIfScoreIsBetween600kAnd700kAndIncomeIsBetween3kAnd5k(){
            doReturn(true).when(customer).isIncomeInRange(3000,5000);
            doReturn(true).when(customer).isCreditScoreInRange(600,700);
            assertTrue(loan.isFN60Available());
        }
    }


    @Nested
    class isNONEAvailable{
        @Test
        void shouldBeTrueIfScoreIsBetween600kAnd700kAndIncomeIsBetween3kAnd5k(){
            doReturn(true).when(customer).hasCreditScoreBelow(600);
            doReturn(true).when(customer).hasIncomeBelow(3000);
            assertTrue(loan.isNONEAvailable());
        }
    }

}