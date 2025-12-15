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

    // move zeroes to the end
    public static int[] moveZeroesToEnd(int [] arr){
        // strategy 1 (keep an index and keep moving all nonzero element to that index
        // than fill remaining positions with zeroes.

        // strategy 2

        return arr;
    }

    // left rotate an array by D position
    // [1,2,3,4,1,5] rotate by 3 [4, 1, 5, 1, 2, 3]
    // [3,4,1, 5, 3, -5] k=8 [1,5,3,-5,3,4]
    public static int[] leftRotateByPosition(int arr[], int d){
        int k = d % arr.length;
        if(k == 0){
            // No change
            return arr;
        }
        // strategy 1 keep on rotating from left by doing the swap
        for(int i=0; i<k; i++){ // time complexity o(n2) space :0(1) temp variable
            int temp = arr[i];
            for(int j=i+1; j< arr.length-1; j++){
                arr[i] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
//        return arr;

        // strategy 2 takes o(n) space and O(n) time
        // put n-k elements in new array
        // put first k elements in new array from n-k th position
        int[] rotatedArr = new int[arr.length-1];
        int l = k;
        for(int i=0; i<arr.length-k; i++){
            rotatedArr[i] = arr[l];
            l++;
        }
        l = 0;
        for(int i = arr.length-k; i< arr.length; i++ ){
            rotatedArr[i] = arr[l];
            l++;
        }
        return rotatedArr;

        // step 3 (Best approach -> O(n) time o(1) space
        // [3,4, 1, 5, 3, -5] , d=8 , k=8/6 = 2
        // to left rotate by d reverse
        // reverse d elements = [4, 3, 1, 5, 3, -5]
        // reverse n-d elements = [4, 3, -5, 3, 5, 1]
        // reverse entire array = [1, 5, 3, -5, 3, 4]

        // first check if k<arr.size
        // then shift all the element to left for arr.size-k;
    }

}
