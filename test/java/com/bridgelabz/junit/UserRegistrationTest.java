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

}