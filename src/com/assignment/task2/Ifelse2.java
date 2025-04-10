package com.assignment.task2;

import java.util.Scanner;

/*Write a program to check whether a
character is an alphabet or not.*/
public class Ifelse2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = sc.next().charAt(0);
        if( ch >='A' && ch <='Z' || ch >='a' && ch <= 'z'){
            System.out.println("Its a character");
        }else {
            System.out.println("Its not  a character");
        }


    }
}
