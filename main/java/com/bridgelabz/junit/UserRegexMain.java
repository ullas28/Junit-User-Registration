package com.bridgelabz.junit;

public class UserRegexMain {
    public static void main(String[] args) throws UserRegistrationException {
        UserDetails userInformation = new UserDetails();

        System.out.println(userInformation.userFirstName());
        System.out.println(userInformation.userLastName());
        System.out.println(userInformation.userEmailId());
        System.out.println(userInformation.userMobNum());
        System.out.println(userInformation.userPassword());
    }
}
