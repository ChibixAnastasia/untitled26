package com.company.testcalculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicNumerals {
    public static int transformationArabicNumerals(String str) {
        ArrayList<String> numbers = new ArrayList<>();

        Pattern pat = Pattern.compile("(-?\\d{1,2})(-|\\+|\\*|/)(-?\\d{1,2})");
        Matcher matcher = pat.matcher(str);

        while (matcher.find()){
            numbers.add(matcher.group(1));
            numbers.add(matcher.group(2));
            numbers.add(matcher.group(3));
        }


        int first = Integer.parseInt(numbers.get(0));
        int second = Integer.parseInt(numbers.get(2));
        String operation = numbers.get(1);

        switch (operation){
            case "+" :
                return first + second;
            case "-" :
                return first - second;
            case "*" :
                return first * second;
            case "/" :
                return first / second;
        }

        return -222;
    }
}
