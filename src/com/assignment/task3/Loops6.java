package com.assignment.task3;

import java.util.Scanner;

/*Write a do-while loop that asks the
user to enter two numbers. The
numbers should be added and the sum
displayed. The loop should ask the
user whether he or she wishes to
perform the operation again. If so,
the loop should repeat; otherwise it
should terminate.*/
public class Loops6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
       do {

           System.out.print("enter number1:");
           int num1 = sc.nextInt();
           System.out.print("enter number2:");
           int num2 = sc.nextInt();
           int sum = num1 + num2;
           System.out.println(sum);
           System.out.print("Do you want to perform another addition? (y/n): ");
           choice = sc.next().charAt(0);
       }while(choice =='y'|| choice=='Y');
       System.out.print("ended.thanks");
    sc.close();
    }
}
