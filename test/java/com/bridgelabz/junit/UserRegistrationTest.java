package com.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationTest {

    @Test
    public void firstName() throws UserRegistrationException{
        Assertions.assertTrue(UserRegistration.firstName(""));
    }

    @Test
    void lastName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.lastName(""));
    }

    @Test
    void email() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.email(""));
    }

    @Test
    void phoneNumber() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.phoneNumber(""));
    }

    @Test
    void passwordRule() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule(""));
    }

}
