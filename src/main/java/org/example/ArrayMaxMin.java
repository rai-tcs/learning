package org.example;

public class ArrayMaxMin {
    public final static int findMaxElement(int[] intArr){
        if(intArr.length<1){
            throw new IllegalArgumentException("Please provide some element for the array");
        }
        int max = intArr[0];
        for(int i: intArr){
            max = Math.max(max, i);
        }
        return max;
    }

    public final static int findMinIndex(int[] intArr){
        if(intArr.length<1){
            throw new IllegalArgumentException("Please provide some element for the array");
        }
        int min = intArr[0];
        for(int i: intArr){
            min = Math.min(min, i);
        }
        return min;
    }
}
