package org.example;

import java.util.*;

public class StringProblems {
    // 1 Sort characters by Frequency
    // return the array of unique characters based on frequency
    // alphanumeric string
    public static char[] sortCharsByFrequency(String input){
        char[] charArray = input.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for(char ch: charArray){
            charCount.computeIfPresent(ch, (key, value)-> value+1);
            charCount.computeIfAbsent(ch, key->1);
        }
//        Queue<Character> queue = new PriorityQueue<Character>((a,b)-> Integer.compare(charCount.get(b), charCount.get(a)));
//        queue.addAll(charCount.keySet());
        List<Character> uniqueChars = new ArrayList<>();
        uniqueChars.addAll(charCount.keySet());
        uniqueChars.sort(Comparator.comparingInt((Character a) -> charCount.get(a)).thenComparingInt(a -> a));
//        uniqueChars.sort((a,b)->{
//            int result = Integer.compare(charCount.get(b), charCount.get(a));
//            if(result!=0){
//                return result;
//            }
//            return Character.compare(a, b);
//        });
//        uniqueChars.addAll(queue);
//        while(!queue.isEmpty()){
//            Character ch = queue.poll();
//            if(!uniqueChars.contains(ch)) {
//                uniqueChars.add(ch);
//            }
//        }
        char[] responseArr = new char[uniqueChars.size()];
        int i =0;
        for(Character ch: uniqueChars){
            responseArr[i] = ch;
            i++;
        }
        for(char ch: responseArr) {
            System.out.println(ch);
        }
        return responseArr;
        // take a set for keys

    }
}
