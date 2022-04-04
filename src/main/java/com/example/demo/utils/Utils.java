package com.example.demo.utils;

public class Utils {

    public static boolean isPalindrome(String value) {

        StringBuilder builder = new StringBuilder(value);
        String reverseName = builder.reverse().toString();
        return value.equals(reverseName);

        // if(name.equals(reverseName)) return "Si es un palíndromo";
        // else return "No es un palíndromo";

    }
}
