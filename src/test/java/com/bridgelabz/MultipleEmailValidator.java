package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleEmailValidator {
public static Pattern userPattern;

    public Boolean validateUserEmail(String email) {
        userPattern=Pattern.compile("^([a-zA-Z0-9]+)(!@#$%^&*][a-zA-Z0-9]+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$");
        Matcher matcher=userPattern.matcher(email);
        if (matcher.matches()){
            return  true;
        }
        else{
            return  false;
        }


    }
}
