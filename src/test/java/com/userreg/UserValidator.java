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


}


