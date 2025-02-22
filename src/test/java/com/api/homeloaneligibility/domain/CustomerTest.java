package com.api.homeloaneligibility.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerTest {

    @Nested
    class hasCreditScoreAbove {
        @Test
        void shouldBeTrueIfHasCreditScoreAbove() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertTrue(customer.hasCreditScoreAbove(700));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreBelow() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 700);
            assertFalse(customer.hasCreditScoreAbove(800));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreEqual() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 700);
            assertFalse(customer.hasCreditScoreAbove(700));
        }
    }

    @Nested
    class hasCreditScoreBelow {
        @Test
        void shouldBeFalseIfHasCreditScoreAbove() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertFalse(customer.hasCreditScoreBelow(700));
        }

        @Test
        void shouldBeTrueIfHasCreditScoreBelow() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 700);
            assertTrue(customer.hasCreditScoreBelow(800));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreEqual() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 700);
            assertFalse(customer.hasCreditScoreBelow(700));
        }
    }

    @Nested
    class isCreditScoreInRange {
        @Test
        void shouldBeTrueIfHasCreditScoreBetween() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertTrue(customer.isCreditScoreInRange(200, 6000));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreBelowMin() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertFalse(customer.isCreditScoreInRange(2000, 5000));
        }

        @Test
        void shouldBeFalseIfHasCreditScoreAboveMax() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 6000);
            assertFalse(customer.isCreditScoreInRange(2000, 5000));
        }

    }

    @Nested
    class hasIncomeAbove {
        @Test
        void shouldBeTrueIfHasIncomeAbove() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertTrue(customer.hasIncomeAbove(4000));
        }

        @Test
        void shouldBeFalseIfHasIncomeBelow() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertFalse(customer.hasIncomeAbove(6000));
        }

        @Test
        void shouldBeFalseIfHasIncomeEqual() {
            var customer = new Customer("Carla Dias", 20.0, 6000.0, 6000);
            assertFalse(customer.hasIncomeAbove(6000));
        }

    }

    @Nested
    class hasIncomeBelow {
        @Test
        void shouldBeTrueIfHasIncomeBelow() {
            var customer = new Customer("Carla Dias", 20.0, 3000.0, 800);
            assertTrue(customer.hasIncomeBelow(4000));
        }

        @Test
        void shouldBeFalseIfHasIncomeGreater() {
            var customer = new Customer("Carla Dias", 20.0, 7000.0, 800);
            assertFalse(customer.hasIncomeBelow(6000));
        }

        @Test
        void shouldBeFalseIfHasIncomeEqual() {
            var customer = new Customer("Carla Dias", 20.0, 6000.0, 6000);
            assertFalse(customer.hasIncomeBelow(6000));
        }

    }

    @Nested
    class isIncomeInRange {
        @Test
        void shouldBeTrueIfHasIncomeInRange() {
            var customer = new Customer("Carla Dias", 20.0, 5000.0, 800);
            assertTrue(customer.isIncomeInRange(2000, 6000));
        }

        @Test
        void shouldBeFalseIfHasIncomeLowerThanMin() {
            var customer = new Customer("Carla Dias", 20.0, 1000.0, 800);
            assertFalse(customer.isIncomeInRange(2000, 6000));
        }

        @Test
        void shouldBeFalseIfHasIncomeGreaterThanMax() {
            var customer = new Customer("Carla Dias", 20.0, 7000.0, 6000);
            assertFalse(customer.isIncomeInRange(2000, 6000));
        }

    }

}