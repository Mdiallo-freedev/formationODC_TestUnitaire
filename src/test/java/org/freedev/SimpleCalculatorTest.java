package org.freedev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;
    @BeforeEach
    void init(){
        calculator = new SimpleCalculator();
    }
    @Test
    void test_if_calculated_is_working(){
        assertEquals(22,calculator.addition(10,12));
    }
    @Test
    void test_soustraction(){
        assertEquals(4,calculator.soustraction(14,10));
    }
    @Test
    void test_multiplication(){
        assertEquals(10,calculator.multiplication(5,2));
    }
    @Test
    void test_isBoolean(){
        assertTrue(calculator.isEvent(10));
        assertFalse(calculator.isEvent(13));

    }

}