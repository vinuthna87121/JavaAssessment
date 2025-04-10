package com.assignment.task3;

import java.util.Scanner;

/*Write a program to sum first n even
numbers using a while loop.*/
public class Loops5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        int n = 2;
        while (count < num) {
            sum = sum + n;
            n = n + 2;
            count++;


        }
        System.out.print(sum);
    }
}