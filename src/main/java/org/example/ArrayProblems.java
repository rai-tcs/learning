package org.example;

public class ArrayProblems {

    public static int secondLargestElement(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i:arr){
            largest = Math.max(largest, i);
            secondLargest = largest>i && secondLargest<i?i:secondLargest;
        }
        return secondLargest;
    }

    public static int[] moveAllZeroesToEnd(int[] arr) {
        // approach one take a counter and put all non zeroes to
        // a new array and fill remaining array with zeroes
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                newArr[count++] = i;
            }
        }
        return newArr;
    }

    public static int[] removeDuplicatesFromSortedArr(int[] arr){

        return arr;
    }
}
