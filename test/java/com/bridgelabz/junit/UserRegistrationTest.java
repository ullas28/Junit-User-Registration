package com.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void firstNameHappyTest() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.firstName("Ullas"));
        Assertions.assertFalse(UserRegistration.firstName("ullas"));
    }
    @Test
    void lastNameHappyTest() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.lastName("Kumar"));
        Assertions.assertFalse(UserRegistration.lastName("kumar"));
    }

    @Test
    void emailHappyTest() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.email("ullaskumark278887941211@gmail.com"));
        Assertions.assertFalse(UserRegistration.email("ullas"));
    }
    @Test
    void phoneNumberHappyTest() throws UserRegistrationException {
        Assertions.assertTrue(UserRegistration.phoneNumber("91 1111111111"));
        Assertions.assertFalse(UserRegistration.phoneNumber("911561561156"));
    }
    @Test
    void passwordRule1HappyTest() throws UserRegistrationException{
        Assertions.assertTrue(UserRegistration.passwordRule1("f4#561AS"));
        Assertions.assertFalse(UserRegistration.passwordRule1("esf523S"));
    }

    @Test
    void passwordRule2HappyTest() throws UserRegistrationException{
        Assertions.assertTrue(UserRegistration.passwordRule2("daU#$23Sd"));
        Assertions.assertFalse(UserRegistration.passwordRule2("sadkh#@4"));
    }

    @Test
    void passwordRule3HappyTest() throws UserRegistrationException{
        Assertions.assertTrue(UserRegistration.passwordRule3("gS#4refF"));
        Assertions.assertFalse(UserRegistration.passwordRule3("sssHSa%$"));
    }
    @Test
    void passwordRule4HappyTest() throws UserRegistrationException{
        Assertions.assertTrue(UserRegistration.passwordRule4("uLas23@23"));
        Assertions.assertFalse(UserRegistration.passwordRule4("DSAsDSE42"));
    }

    @Test
    void firstNameSadTest() throws UserRegistrationException {
        Assertions.assertFalse(UserRegistration.firstName("Ullas"));
        Assertions.assertTrue(UserRegistration.firstName("ullas"));
    }
    @Test
    void lastNameSadTest() throws UserRegistrationException {
        Assertions.assertFalse(UserRegistration.lastName("Kumar"));
        Assertions.assertTrue(UserRegistration.lastName("kumar"));
    }

    @Test
    void emailSadTest() throws UserRegistrationException {
        Assertions.assertFalse(UserRegistration.email("ullaskumark278887941211@gmail.com"));
        Assertions.assertTrue(UserRegistration.email("ullas"));
    }
    @Test
    void phoneNumberSad() throws UserRegistrationException {
        Assertions.assertFalse(UserRegistration.phoneNumber("91 1111111111"));
        Assertions.assertTrue(UserRegistration.phoneNumber("911561561156"));
    }
    @Test
    void passwordRule1SadTest() throws UserRegistrationException{
        Assertions.assertFalse(UserRegistration.passwordRule1("f4#561AS"));
        Assertions.assertTrue(UserRegistration.passwordRule1("esf523S"));;
    }

    @Test
    void passwordRule2SadTest() throws UserRegistrationException{
        Assertions.assertFalse(UserRegistration.passwordRule2("daU#$23Sd"));
        Assertions.assertTrue(UserRegistration.passwordRule2("sadkh#@4"));
    }

    @Test
    void passwordRule3SadTest() throws UserRegistrationException{
        Assertions.assertFalse(UserRegistration.passwordRule3("gS#4refF"));
        Assertions.assertTrue(UserRegistration.passwordRule3("sssHSa%$"));
    }
    @Test
    void passwordRule4SadTest() throws UserRegistrationException{
        Assertions.assertFalse(UserRegistration.passwordRule4("uLas23@23"));
        Assertions.assertTrue(UserRegistration.passwordRule4("DSAsDSE42"));
    }

}
