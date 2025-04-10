package com.assignment.task3;

import java.util.Scanner;

/*Write a program to display Fibonacci
Series.*/
public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.print(num1 +","+ num2 + ",");
        for(int i=0;i<num;i++){
            int num3=num1+num2;
          num1=num2;
          num2=num3;
            System.out.print(num3+",");
        }




    }
}
