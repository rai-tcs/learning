package org.example;

import java.util.*;

public class StringMediumProblems {
    // sum of beauty of all sub strings beauty = diff of highest occured char - least occured char
    // s = xyx, x 2, y 1, beauty = 2-1 = 1;
    // s = xy -> x:1 y:1 beauty = 1-1 = 0;
    // s = x or y ->  beauty = 0;

    // approach 1 -> find all substrings
    // approach 2 -> calculate beauty for all strings
    // sum the beauty

//    public static int beauty(String s){
//
//    }

    public static List<String> allPossibleSubStrings(String s){
        // string length -> 5  (1,2,3,4,5) , (1,2,3, 4) , (1,2,3), (1,2), 1,
        System.out.println("---- provided string ----"+ s);
        List<String> allSubStrings = new ArrayList<>();
        char[] charArr = s.toCharArray();
        int count = 0;
        for(int i=0; i<charArr.length; i++){
            for(int j = charArr.length; j>i; j--){
                String subStr = s.substring(i, j);
                allSubStrings.add(subStr);
                System.out.println("substring " + count+ " ->" + subStr);
                count++;
            }
        }
        return allSubStrings;
    }

    // s = "Hello world", out -> "dlrow olleH"
    public static String reverseEveryWordInAString(String s){
        String [] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            StringBuilder sb = new StringBuilder(words[i]);
            reversedString.append(sb.reverse()).append(" ");
        }
        return reversedString.toString();
    }

    // convert a number to roman no
    // 1 -> I
    // 5 -> V
    // 10 -> X
    // 50 -> L
    // 100 -> C
    // 500 -> D
    // 1000 -> M
    // strategy -> keep dividing the number with highest roman no less than number
    public String noToRomanNo(int number){
        String s = "";
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b)-> Integer.compare(b, a));
        int n = number;
        while(n!=0){

        }


        return s;
    }

    // check for valid parenthesis string
    // for ex "(()()(()))" -> true  allowed chars -> 0-9, +-/*/ and (,)
    public static boolean isValidParenthesisString(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("--------- string medium problems -----");
//        Scanner sc = new Scanner(System.in);
//        String text = sc.next();
        allPossibleSubStrings("text");
        System.out.println("----- reverse string -----");
        String reversed = reverseEveryWordInAString("Hello world from java");
        System.out.println(reversed);
    }
}
