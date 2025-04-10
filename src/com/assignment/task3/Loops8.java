package com.assignment.task3;

import java.util.Scanner;

/*Write a program to enter the numbers
till the user wants and at the end
the program should display the
largest and smallest numbers entered.
        (using loops only)*/
public class Loops8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char choice;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do{
            num = sc.nextInt();
            if(num<min){
                min = num;
            }if(num>max){
                max= num;
            }
       System.out.println("do u want to enter another num? y/n");
            choice = sc.next().charAt(0);
        }while (choice =='y'|| choice == 'Y');
        System.out.println("Smallest num is"+ min);
        System.out.println("Smallest num is"+ max);


    }
}
