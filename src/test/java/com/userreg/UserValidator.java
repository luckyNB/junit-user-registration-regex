package com.userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private static Pattern user_Registation_Pattern;
    private String lastName;

    public static boolean validateFirstName(String firstName) {
        user_Registation_Pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = user_Registation_Pattern.matcher(firstName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean validateLastName(String lastName) {
        user_Registation_Pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher  = user_Registation_Pattern.matcher(lastName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validateEmail(String emailId) {
        user_Registation_Pattern = Pattern.compile("^([a-zA-Z0-9]+)([!@#$%^&][a-zA-Z0-9]+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$");
        Matcher matcher  = user_Registation_Pattern.matcher(emailId);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateMobileNo(String MobileNo) {
        user_Registation_Pattern = Pattern.compile("[0-9]{2}[: :][0-9]{10}");
        Matcher matcher  = user_Registation_Pattern.matcher(MobileNo);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validatePassword(String password) {
        user_Registation_Pattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#$%]).{8,})");
        Matcher matcher  = user_Registation_Pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}


