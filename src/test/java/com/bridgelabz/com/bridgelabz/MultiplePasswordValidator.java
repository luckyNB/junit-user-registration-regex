package com.bridgelabz.com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiplePasswordValidator {

    public static Pattern userPattern;


    public static Boolean validateUserPassword(String password) {
         userPattern=Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
         Matcher matcher=userPattern.matcher(password);
         if (matcher.matches())
             return  true;
         else
             return false;

    }
}
