package com.company.testcalculator;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите выражение без пробелов:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.matches("(-?(1|2|3|4|5|6|7|8|9|10))(-|\\+|\\*|/)(-?)(1|2|3|4|5|6|7|8|9|10)")) {
            System.out.println(ArabicNumerals.transformationArabicNumerals(str));
        } else if(str.matches("(I|II|III|IV|V|VI|VII|VIII|IX|X)(\\+|-|\\*|/)(I|II|III|IV|V|VI|VII|VIII|IX|X)")){
            System.out.println(   RomanNumerals.transformationRomanNumerals(str));
        }else {
            throw new UnsupportedOperationException();
        }


    }
}
