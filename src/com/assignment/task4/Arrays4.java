package com.assignment.task4;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] num={99,34,23,45,67};
        int n =46;
        Arrays.sort(num);
        int left = 0;
        int right = num.length - 1;
        boolean found =false;
        while(left<right) {

            int mid = left + (right - left) / 2;
            if(n==num[mid]){
            found=true;
            break;
            }else if (n <num[mid]){
             right = mid-1;
            }else{
                left = mid+1;

            }

        }
        if(found){
            System.out.print("present");
        }else{
            System.out.print("not present");
        }
    }
}
