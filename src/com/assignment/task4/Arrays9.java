package com.assignment.task4;
//Given an array of integers, return
//indices of the two numbers such that
//they add up to a specific target.
//Input: nums = [1,4,10,
//-3], target =
//14
public class Arrays9 {
    public static void main(String[] args) {
        int[]arr = {1,4,10,-3};
        int target =14;
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int total = arr[i]+ arr[j];
                if(total ==  target){
                    System.out.print(target + " found at "+ i + " +" + j);
                }
            }
        }

        }
}
