package org.freedev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUtilTest {
    RegistrationUtil registrationUtil;
    @BeforeEach
    void setUp() {
        registrationUtil = new RegistrationUtil();
    }
    @Test
    void test_if_Userintput(){
        assertTrue(registrationUtil.validateUserInput("mamadou","doumbia","doumbia"));

    }
    @Test
    void test_if_unername_isEmpty(){
        boolean actual = registrationUtil.validateUserInput("","doumbi","doumbia");
        assertFalse(actual);
    }
    @Test
    void test_if_pasword_isEmpty(){
        boolean actual = registrationUtil.validateUserInput("","doumbi","doumbia");
        assertFalse(actual);
    }
    @Test
    void test_if_all_isEmpty(){
        boolean actual = registrationUtil.validateUserInput("","","");
        assertFalse(actual);
    }
    @Test
    void test_correct_isEmpty(){
        boolean actual = registrationUtil.validateUserInput("mamadou","doumbia","doumbia");
        assertTrue(actual);
    }
}