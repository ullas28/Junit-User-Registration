package com.bridgelabz.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //method for checking firstName
    public static boolean firstName(String firstName) throws UserRegistrationException {
        try {
            if (firstName.isEmpty())
                throw new UserRegistrationException("Please enter valid First Name!", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
            {
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(firstName);
                return matcher.matches();
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
        }
    }

    //method for checking lastName
    public static boolean lastName(String lastName) throws UserRegistrationException {
        try {
            if (lastName.isEmpty()) {
                throw new UserRegistrationException("Please enter valid Last Name!", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
            }
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
        }
    }

    //method for checking valid email ID
    public static boolean email(String emailID) throws UserRegistrationException {

        try {
            if (emailID.isEmpty()) {
                throw new UserRegistrationException("Please enter valid Email ID!", UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
            }
            String regex = "^[a-z]{3,}([_+-.]?[a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,][a-z]{2,3}+)*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emailID);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid Email ID!", UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
        }
    }

    //method to check valid phone number
    public static boolean phoneNumber(String phoneNumber) throws UserRegistrationException {
        try {
            if (phoneNumber.isEmpty())
                throw new UserRegistrationException("Please enter valid Mobile Number!", UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);

            String regex = "^(0|91)?[\\s][0-9]{10}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid Mobile Number!", UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
    }

    //method to check password
    public static boolean passwordRule(String password) throws UserRegistrationException {
        try {
            if (password.isEmpty())
                throw new UserRegistrationException("Please enter valid Password!", UserRegistrationException.ExceptionType.INVALID_PASSWORD);

            String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter valid Password!", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
        }
    }

}