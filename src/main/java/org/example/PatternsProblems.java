package org.example;

public class PatternsProblems {

    public static void printStar(int rowSize){
        printNumber(rowSize);
        for(int i=0; i<rowSize;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNumber(int rowSize){
        for(int i=0; i<rowSize;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
