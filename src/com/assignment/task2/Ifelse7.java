package com.assignment.task2;

import java.util.Scanner;

/*Write a program in JAVA to break and
continue if the following cases
occur:
If the user enters a negative number
just break the loop and print “It’s
Over”
If the user enters a positive number
just continue in the loop and print
“Good Going”*/
public class Ifelse7 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            double num = sc.nextDouble();
            if (num < 0) {

                System.out.println("its over");
                break;

            } else if (num > 0) {
                System.out.println("good going");
                continue;
            }else {
                System.out.println("you entered zero");
            }

        }
    }
}
