package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayHardProblems {
    // 3 Sum problem
    // unique pairs of arrays whose sum is equal to a given no.
    // in = [2, -1, -1, 3, -3, 4, 0]  , out = [[2,-1,-1], [3, -3], [-3, 4, -1], [0]]
    // {2: [0], -1: [1,2], 3:[3], -3: [4], 4:[5], 0:[6]}
    // diff = number - given No <
    //list<Integer> map.remove()  []
    public static List<List<Integer>> threeSum(int[] inputArr, int sum){
        List<List<Integer>> threeSumList = new ArrayList<>();// [2][3]
        Map<Integer, List<Integer>> charIndexexesMap = new HashMap<>();
        int arrayIndex = 0;
        for(int ele: inputArr){
            List<Integer> value = charIndexexesMap.get(ele);
            if(value!=null){
                value.add(arrayIndex);
                charIndexexesMap.put(ele, value);
            } else {
                value = new ArrayList<>();
                value.add(arrayIndex);
                charIndexexesMap.put(ele, value);
            }
//            charIndexexesMap.computeIfAbsent(ele, v-> new ArrayList<>()).add(arrayIndex);
//            Integer finalArrayIndex = arrayIndex;
//            charIndexexesMap.computeIfPresent(ele, (k, v)-> return {k, value});
            arrayIndex = arrayIndex+ 1;
        }

        List<Integer> uniqueSet = new ArrayList<>();
        int currentSum = 0;
        for(int ele: inputArr){
            if(uniqueSet.isEmpty()) {
                currentSum = ele;
                uniqueSet.add(ele);
            } else {
                int diff = sum - currentSum - ele;
                if(charIndexexesMap.containsKey(diff) && charIndexexesMap.containsKey(ele)){
                    uniqueSet.add(diff);
                    uniqueSet.add(ele);
                    threeSumList.add(uniqueSet);
                    uniqueSet = new ArrayList<>();
                }

            }

        }
        threeSumList.stream().forEach(ele->
                {System.out.println();
        System.out.println("-------------");
            ele.stream().forEach(e-> System.out.print(e+ ","));
            System.out.println("----------");
        }
        );
        return threeSumList;
    }
}
