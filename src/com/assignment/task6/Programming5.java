package com.assignment.task6;

import java.util.Scanner;

//Program to check the Armstrong
//number? 153
public class Programming5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to verify if its armstrong num:");
        int num = sc.nextInt();
        int Digit = String.valueOf(num).length();
        int temp = num;
        double result = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            result = result + Math.pow(digit, Digit);
            num = num / 10;


        }
        if(result == temp){
            System.out.print("armstrong");
        }else {
            System.out.print("not armstrong");
        }
    }
}
