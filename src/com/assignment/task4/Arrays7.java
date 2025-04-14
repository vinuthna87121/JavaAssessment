package com.assignment.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*.Write a program to remove the
duplicates from a sorted array,
change them into 0 and add 0 in the
end.
input: [2,2,3,3,4,4,4,11,11,11,11]
output:[2,3,4,11,0,0,0,0,0,0,0]*/
public class Arrays7 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int[] arr = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        result.add(arr[0]);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        int zeros = arr.length-result.size();
        for(int i=0;i<=zeros;i++){
            result.add(0);
        }
        System.out.print(result + ",");

    }
}
