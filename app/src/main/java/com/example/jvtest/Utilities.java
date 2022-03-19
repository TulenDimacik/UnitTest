package com.example.jvtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Utilities {

    public static boolean checkFIO(String FIO){
        if(FIO.length() - FIO.replace(" ","").length() == 2 || FIO.length() - FIO.replace(" ","").length() == 3)
            return true;
        else
            return false;
    }

    public static boolean checkPassword(String pwd)
    {
        boolean spec = false;
        if(pwd.matches(".*[;!@#$%^&*()_+=№%?*~`<>/|{}].*"))
        {
            spec = true;
        }
        char simvol;
        boolean Upcase = false;
        boolean lowerCase = false;
        boolean num = false;

        for(int i=0;i < pwd.length();i++) {
            simvol = pwd.charAt(i);
            if( Character.isDigit(simvol)) {
                num = true;
            }
            else if (Character.isUpperCase(simvol)) {
                Upcase = true;
            } else if (Character.isLowerCase(simvol)) {
                lowerCase = true;
            }
            if(num && Upcase && lowerCase && pwd.length() > 7 && spec == true)
                return true;
        }
        return false;

    }

    public static boolean checkLogin(String log){
        if(log.length() > 5)
            return true;
        else
            return false;
    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean checkEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }


}
