package com.api.homeloaneligibility.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Nested
    class hasCreditScoreAbove{
        @Test
       void shouldBeTrueIfHasCreditScoreAbove (){
          var customer= new Customer("Carla Dias",20.0,5000.0,800);
       assertTrue(customer.hasCreditScoreAbove(700));
       }

        @Test
        void shouldBeFalseIfHasCreditScoreBelow (){
            var customer= new Customer("Carla Dias",20.0,5000.0,700);
            assertFalse(customer.hasCreditScoreAbove(800));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreEqual (){
            var customer= new Customer("Carla Dias",20.0,5000.0,700);
            assertFalse(customer.hasCreditScoreAbove(700));
        }
    }

    @Test
    void hasCreditScoreAbove() {
    }

    @Test
    void isCreditScoreInRange() {
    }

    @Test
    void hasCreditScoreBelow() {
    }

    @Test
    void hasIncomeAbove() {
    }

    @Test
    void isIncomeInRange() {
    }

    @Test
    void hasIncomeBelow() {
    }
}