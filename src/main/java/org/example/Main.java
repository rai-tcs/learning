package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.reverse().toString();
    }

    public static void findMaxMinFromArray(int[] arr){
        int max = ArrayMaxMin.findMaxElement(arr);
        int min = ArrayMaxMin.findMinIndex(arr);
        System.out.printf("max = %d, min = %d", max, min);
        System.out.println();
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] inputArr = {2, -1, -1, 3, -3, 4, 0};
        System.out.println("3 sum "+ArrayHardProblems.threeSum(inputArr, 0));
        System.out.println("reverse string " + reverseString("abc"));
        System.out.println("string problems sort by frequency"+ StringProblems.sortCharsByFrequency("tree"));
        System.out.println("is no a palindrome"+(NumberProblems.reverseANumber(1234567) == 7654321));
        System.out.println("Armstrong no"+(NumberProblems.armStrongNo(9474) == 9474));
        PatternsProblems.printStar(5);
        int[] arr = {0,0, 0, 1,22,-44,-100, 2000, 21, -99};
        findMaxMinFromArray(arr);
        System.out.println("2nd largest element = "+ ArrayProblems.secondLargestElement(arr));
        System.out.println("array after moving all zeroes to end " + Arrays.toString(ArrayProblems.moveAllZeroesToEnd(arr)));
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            try {
                Thread.sleep(2000);
                MyThread myThread = new MyThread();
                myThread.start();
                MyThreadWithRunnable myThreadWithRunnable = new MyThreadWithRunnable();
                Thread myThread2 = new Thread(myThreadWithRunnable);
                myThread2.start();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}