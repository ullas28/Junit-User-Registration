package com.bridgelabz.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String firstName(String firstName) throws UserRegistrationException{

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(firstName.isEmpty())
                throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);

            Validate fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(firstName);
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
        }
    }

    public String lastName(String lastName) throws UserRegistrationException{
        //regex pattern
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(lastName.isEmpty())
                throw new UserRegistrationException("Please enter valid Last Name!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);

            Validate fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(lastName);
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid First Name!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
        }
    }

    public String email(String emailId) throws UserRegistrationException {
        String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        try {
            if(emailId.isEmpty())
                throw new UserRegistrationException("Please enter valid Email ID!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(emailId);
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Email ID!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
        }
    }

    public String phoneNumber(String mobNum) throws UserRegistrationException {
        String regex = "^[0-9]{1,3}-[0-9]{10}$";
        try {
            if(mobNum.isEmpty())
                throw new UserRegistrationException("Please enter valid Mobile Number!" , UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(mobNum);
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Mobile Number!" , UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
    }

    public String passwordRule(String pswrd) throws UserRegistrationException {
        String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        try {
            if(pswrd.isEmpty())
                throw new UserRegistrationException("Please enter valid Password!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Happy" : "Sad";
            return fNameValidate.validate(pswrd);
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid Password!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);
        }
    }
}