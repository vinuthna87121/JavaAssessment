package com.assignment.task3;

import java.util.Scanner;

/*
Write a program to Find Factorial of
a Number.*/
public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        int fact=1;
       for(int i=1;i<=num;i++){
           fact=fact*i;

        }
       System.out.print(fact);

    }
}
