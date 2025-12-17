package org.example;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackAndQueue {

    //    leetcode top 10 problems on Monotonic Stack and Queue
    //    1) 739. Daily Temperatures — Next Greater Element (index-wise)
    //    2) 42. Trapping Rain Water — Monotonic Stack
    //    3) 84. Largest Rectangle in Histogram — Monotonic Stack
    //    4) 862. Shortest Subarray with Sum at Least K — Monotonic Queue
    //    5) 321. Create Maximum Number — Monotonic Stack
    //    6) 496. Next Greater Element I — Next Greater Element using Stack
    //    7) 503. Next Greater Element II — Circular Array Next Greater Element using Stack
    //    8) 1504. Count Submatrices With All Ones — Monotonic Stack
    //    9) 1856. Maximum Subarray Min-Product — Monotonic Stack
    //    10) 907. Sum of Subarray Minimums — Monotonic Stack

    // find next greater element for each index
    // for ex  temperatures = [73,74,75,71,69,72,76,73], output = [1,1,4,2,1,1,0,0], [74, 75, 76, 72, 76, 73]
    // for ex = [1,3,2,4] output = [3, 4, 4, -1]
    // iterate till arr.length-1 since last element will not have next greater element
    // [1] 2 is greater than 1 -> push index 0 in stack
    // [2]    another stack [1]
    // []
    // [1, 2, 3, 4] -> pop all elements from stack since all are smaller than 4
    //1 -> pusht [1], next 3 , pop[1] push[3], next 2 stack 1 [3] stack 2 = [1, 2], 4-> [3, 4] , [1, 2]
    public static int[] nextWarmerTemperature(int[] temperatures){
        // strategy using stack -> keep highest at the top and lowest at bottom
        // traverse tempartures array from start to end
        // next greater element index-wise
        int[] result = new int[temperatures.length];
        Arrays.fill(result, -1);
        int resultCounter = 0;
        Stack<Integer> greaterElementStack = new Stack<>();
        // [1, 3, 2, 4] -> [4]              [-1, -1, -1, -1]
        // [1, 3, 2, 4] -> 2 < peek          [-1, -1, 4, -1]
        // [1, 3, 2, 4] -> 3
        for(int i = temperatures.length-1; i>=0; i--){
            while(!greaterElementStack.isEmpty() && temperatures[i]>= greaterElementStack.peek()){
                greaterElementStack.pop();
            }
            if(!greaterElementStack.isEmpty()){
                result[i]= greaterElementStack.peek();
            }
            // [1]
            greaterElementStack.push(temperatures[i]);
        }
        return result;
    }

    //leetcode top25 monotonic queue problems
    // 1) 862. Shortest Subarray with Sum at Least K — Monotonic Queue
    //  2) 239. Sliding Window Maximum — Monotonic Queue
    // 3) 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit — Monotonic Queue
    // 4) 84. Largest Rectangle in Histogram — Monotonic Stack
    // 5) 1504. Count Submatrices With All Ones — Monotonic Stack
    // 6) 1856. Maximum Subarray Min-Product — Monotonic Stack
    //  7) 907. Sum of Subarray Minimums — Monotonic Stack
    // 8) 862. Shortest Subarray with Sum at Least K — Monotonic Queue
    // 9) 76. Minimum Window Substring — Sliding Window with Character Count
    // 10) 209. Minimum Size Subarray Sum — Sliding Window
    // 11) 3. Longest Substring Without Repeating Characters — Sliding Window with HashSet
    // 12) 1004. Max Consecutive Ones III — Sliding Window with Limited Zeros
    // 13) 424. Longest Repeating Character Replacement — Sliding Window with Character Count
    // 14) 340. Longest Substring with At Most K Distinct Characters — Sliding Window with HashMap
    // 15) 76. Minimum Window Substring — Sliding Window with Character Count
    // 16) 209. Minimum Size Subarray Sum — Sliding Window
    // 17) 3. Longest Substring Without Repeating Characters — Sliding Window with HashSet
    // 18) 1004. Max Consecutive Ones III — Sliding Window with Limited Zeros
    // 19) 424. Longest Repeating Character Replacement — Sliding Window with Character Count
    // 20) 340. Longest Substring with At Most K Distinct Characters — Sliding Window with HashMap
    // 21) 992. Subarrays with K Different Integers — Sliding Window with Frequency Map
    // 22) 1456. Maximum Number of Vowels in a Substring of Given Length — Sliding Window
    // 23) 76. Minimum Window Substring — Sliding Window with Character Count


    public static void main(String[] args){
        System.out.println("Monotonic Stack and Queue...");
        System.out.println(Arrays.toString(nextWarmerTemperature(new int[]{73,74,75,71,69,72,76,73})));
    }
}
