package com.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void firstName() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.firstName("Ullas"));
        Assertions.assertFalse(UserRegistration.firstName("ullas"));
    }

}