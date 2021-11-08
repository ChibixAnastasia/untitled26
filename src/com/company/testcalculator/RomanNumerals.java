package com.company.testcalculator;


public class RomanNumerals {
    public static String transformationRomanNumerals(String str){
        String [] romanArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String [] mass = str.split("(\\+|-|\\*|/)");

        String  mass1 = mass[0];
        String mass2 = mass[1];

        int first = 0;
        int second = 0;

        for (int i = 0; i < 10; i++) {
            if(mass1.equals(romanArray[i])){
                first = i+1;
            }
            if (mass2.equals(romanArray[i])){
                second = i +1;
            }
        }
        if(str.contains("+")){
            return RomanAnswer.romanAnswer(first + second);
        }else if(str.contains("/")){
            return RomanAnswer.romanAnswer(first / second);
        }else  if (str.contains("-")){
            return  RomanAnswer.romanAnswer(first - second);
        } else if(str.contains("*")) {
            return RomanAnswer.romanAnswer(first * second);
        }

        return "Exeption";
    }
}
