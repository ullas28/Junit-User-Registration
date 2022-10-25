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

    @Test
    void passwordRule2() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule2("daU#$23Sd"));
        Assertions.assertFalse(UserRegistration.passwordRule2("sadkh#@4"));
    }

    @Test
    void passwordRule3() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule3("gS#4refF"));
        Assertions.assertFalse(UserRegistration.passwordRule3("sssHSa%$"));
    }

    @Test
    void passwordRule4() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.passwordRule4("uLas23@23"));
        Assertions.assertFalse(UserRegistration.passwordRule4("DSAsDSE42"));
    }

    @Test
    void emailIdValidator() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.emailIdValidator("abc.100@abc.com.au"));
        Assertions.assertFalse(UserRegistration.emailIdValidator("abc@gmail.com.aa.au"));
    }
}