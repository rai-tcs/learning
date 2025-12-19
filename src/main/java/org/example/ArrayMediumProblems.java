package org.example;

import java.util.Arrays;

public class ArrayMediumProblems {

    // Dutch National Flag Problem
    public static int[] sortArrOfZeroesOnesAndTwos(int [] arr){
        // [0, 0, 0, 1, 0, 2, 2, 2, 0, 0, 1, 1, 1, 2, 2, 2, 0, 1, 1, 2]
        int zero = 0;
        int one = 1;
        int two = 2;
        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]^zero)==0){
               arr[zeroCounter]=0;
               zeroCounter++;
            }
            if((arr[i]^one) == 0){
                arr[oneCounter] = 1;
                oneCounter++;
            }
            if((arr[i]^two) == 0){
                arr[twoCounter] = 2;
                twoCounter++;
            }
        }
        for(int i=0; i<zeroCounter; i++){
            arr[i]=0;
        }
        for(int i=zeroCounter; i< zeroCounter + oneCounter; i++){
            arr[i]=1;
        }
        for(int i= zeroCounter + oneCounter; i< arr.length; i++) {
            arr[i] = 2;
        }
        return arr;

        // take three varialble, low , mid and high and then put elemnent 0 , 1 and 2 there
        // count the no of zeroes, ones and twos then set in array
    }

    public static void main(String[] args){
        System.out.println("------ Array Medium Problems -----");
        System.out.println("Sort an array of 0's 1's and 2's");
        int[] arr = {0, 0, 0, 1, 0, 2, 2, 2, 0, 0, 1, 1, 1, 2, 2, 2, 0, 1, 1, 2};
        System.out.println("original array = " +Arrays.toString(arr));
        System.out.println("sorted array by zeroes, ones and twos = " + Arrays.toString(sortArrOfZeroesOnesAndTwos(arr)));
    }
}
