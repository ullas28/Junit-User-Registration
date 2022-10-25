package com.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void firstName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.firstName("Ullas"));
        Assertions.assertFalse(UserRegistration.firstName("ullas"));
    }

    @Test
    void lastName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.lastName("Kumar"));
        Assertions.assertFalse(UserRegistration.lastName("kumar"));
    }

    @Test
    void email() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.email("ullaskumark278887941211@gmail.com"));
        Assertions.assertFalse(UserRegistration.email("ullas"));
    }

    @Test
    void phoneNumber() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.phoneNumber("91 1111111111"));
        Assertions.assertFalse(UserRegistration.phoneNumber("911561561156"));
    }

    @Test
    void passwordRule1() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule1("f4#561AS"));
        Assertions.assertFalse(UserRegistration.passwordRule1("esf523S"));
    }
}