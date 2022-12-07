package org.freedev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void test_if_calculated_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(22,calculator.calculateAdd(10,12));
    }
}