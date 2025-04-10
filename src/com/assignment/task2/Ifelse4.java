package com.assignment.task2;
/*Write a program to check whether a
year is a leap year.*/
public class Ifelse4 {
    public static void main(String[] args) {
        int year =2024;
        if ((year % 4 != 0 || year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " "+"is not a leap year");
        } else {
            System.out.println(year + " "+"is a leap year");
        }

    }
}
