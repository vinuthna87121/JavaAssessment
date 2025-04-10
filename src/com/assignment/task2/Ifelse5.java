package com.assignment.task2;

import java.util.Scanner;

/*Write a program to assign the grade
on the basis of percentage
if the percentage is above 90,
assign grade A
if the percentage is above 75,
assign grade B
if the percentage is above 65,
assign grade C */
public class Ifelse5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade:");
        int grade = sc.nextInt();
        if (grade > 90) {
            System.out.println("A");
        }else if (grade >75 && grade <=90){
            System.out.println("b");
        }else if(grade >65 && grade <=75){
            System.out.println("C");
        }else{
            System.out.println("fail");
        }

    }
}
