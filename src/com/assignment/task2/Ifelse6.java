package com.assignment.task2;

import java.util.Scanner;

/*Write a program to create a
calculator using the switch case.*/
public class Ifelse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num:");
        double num1 = sc.nextDouble();
        System.out.println("enter the second num:");
        double num2 = sc.nextDouble();
        System.out.println("enter the operator:");
        char operator = sc.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;

            default:
                System.out.println("not a valid operator");
        }


    }
}
