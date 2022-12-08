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
}