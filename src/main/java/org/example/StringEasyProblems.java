package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringEasyProblems {

    public static int largestValueOddInteger(int number){
        String no = String.valueOf(number);
        List<Integer> oddDigits = new ArrayList<>();
        int j = no.length();
        int max = Integer.MIN_VALUE;
        for(int i =0; i<no.length(); i++){
            while(j>i) {
                int formedNo = Integer.valueOf(no.substring(i, j));
                if (formedNo % 2 != 0 && max<formedNo) {
                    max = formedNo;
                }
                j=j-1;
            }
            j = no.length();
        }
        return max;
    }


    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int d = num.charAt(i) - '0';
            if ((d & 1) == 1) { // odd digit found
                return num.substring(0, i + 1);
            }
        }
        return ""; // no odd digit → no odd number possible
    }


    public static void main(String[] args){
        System.out.println("------- string easy problems");
        int number = 123456;
        System.out.println("Largest odd integer from " + number + " is: " + largestValueOddInteger(number));
        number = 5347;
        System.out.println("Largest odd integer from " + number + " is: " + largestValueOddInteger(number));

        System.out.println("Largest odd number from string 123456 is: " + largestOddNumber("123456"));
    }
}
