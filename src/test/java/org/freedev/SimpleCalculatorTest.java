package org.freedev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void test_if_calculated_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(22,calculator.addition(10,12));

    }

    @Test
    void testSoustraction(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.soustraction(14,10));
    }
    @Test
    void testMultiplication(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10,calculator.multiplication(5,2));
    }
    @Test
    void testBoolean(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(false,calculator.isEvent(13));
    }

}