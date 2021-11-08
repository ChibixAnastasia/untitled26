package com.company.testcalculator;

public class RomanAnswer {
    public static String romanAnswer(int a){
        String [] romanNumerals = {" ","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String answer = "null";
        if(a>0 && a< 10){
            return answer = romanNumerals[a];
        }else if(a>9 && a<20){
            return answer= "X"+romanNumerals[a%10];
        }else if(a>19 && a<30){
            return answer = "XX" + romanNumerals[a%10];
        }else if(a> 29 && a<40){
            return answer = "XXX" + romanNumerals[a%10];
        }else if(a>39 && a<50){
            return answer = "XL" +romanNumerals[a%10];
        }else if(a>49 && a<60){
            return answer = "L" + romanNumerals[a%10];
        }else if (a>59 && a<70){
            return answer = "LX" + romanNumerals[a%10];
        }else if (a>69 && a<80){
            return answer = "LXX" + romanNumerals[a%10];
        }else if (a>79 && a<90){
            return answer = "LXXX" +romanNumerals[a%10];
        }else if (a>89 && a<100){
            return answer = "XC" + romanNumerals[a%10];
        }else if(a== 100){
            return answer = "C";
        }

        return "Exeption";
    }

}
