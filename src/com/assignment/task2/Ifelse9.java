package com.assignment.task2;

import java.util.Scanner;

/*Write a program to input
electricity unit charges and
calculate total electricity bill
according to the given condition:
For first 60 units Rs. 0.30/unit
For next 90 units Rs. 0.75/unit
For next 120 units Rs. 1.10/unit
For unit above 300 Rs. 2.50/unit
An additional surcharge of 20% is
added to the bill*/
public class Ifelse9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <= 60) {
            bill = units * 0.30;
        } else if (units <= 150) {
            bill = (60 * 0.30) + ((units - 60) * 0.75);
        } else if (units <= 270) {
            bill = (60 * 0.30) + (90 * 0.75) + ((units - 150) * 1.10);
        } else {
            bill = (60 * 0.30) + (90 * 0.75) + (120 * 1.10) + ((units - 270) * 2.50);
        }


        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;


        System.out.println("Electricity Bill (before surcharge): " + bill);
        System.out.println("Surcharge (20%): " + surcharge);
        System.out.println("Total Electricity Bill: " + totalBill);

        scanner.close();
    }
}


