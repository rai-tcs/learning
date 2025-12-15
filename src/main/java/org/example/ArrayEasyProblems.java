package org.example;

import java.util.Arrays;

public class ArrayEasyProblems {
    // problem 1
    // check if array is sorted
    public static boolean isIntArrSorted (int[] arr, boolean isInAscendingOrder){
        for(int i =0; i< arr.length-1; i++){
            int j = i+1;
            if(isInAscendingOrder && (arr[i] > arr[j])){
                return false;
            } else if(!isInAscendingOrder && (arr[j] < arr[i])){
                return false;
            }
        }
        return true;
    }

    // remove duplicates without using new memory
    // [0, 1, 2, 2, 2, 3, 3]
    public static int removeDuplicatesFromSortedArr(int[] arr){
        Arrays.sort(arr);
        int j = 0;
        for(int i=1; i< arr.length; i++){

            if(arr[i]!=arr[j]){
                j++;
                arr[j]= arr[i];
            }
        }
        printElementsByIndex(arr, j);
        return j;
    }

    public static void printElementsByIndex(int[] arr, int index){
        for(int i = 0; i<=index; i++){
            System.out.println(arr[i]);
        }
    }
}
