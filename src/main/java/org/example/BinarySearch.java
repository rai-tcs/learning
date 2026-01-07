package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static int findIndex(int[] arr, int index){
        int left = 0;
        int right = arr.length -1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==index){
                return mid;
            } else if(arr[mid]<index){
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static int searchInsertPosition(int[] arr, int searchValue){
        int left = 0;
        int right = arr.length; // right is exclusive
        int mid = -1;
        while(left<right){
            mid = left + (right-left)/2;
            if(arr[mid]<searchValue){
                left = mid +1;
            } else {
                right = mid; // keep mid
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 2, 3, 11, 10, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = 1;
        int result = findIndex(arr, index);
        System.out.println("------- Binary Search Implementation");
        System.out.println("Index of "+index+" is : "+result);
        int searchValue = 12;
        int insertPos = searchInsertPosition(arr, searchValue);
        System.out.println("Insert position of "+searchValue+" is : "+insertPos);
    }
}
