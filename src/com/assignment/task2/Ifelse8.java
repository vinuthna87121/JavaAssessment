package com.assignment.task2;

import java.util.Scanner;

/*Calculate income tax paid by an
employee to the government as per the
slabs mentioned below:
Income Slab Tax
2.5L – 6.0L 10%
        6.0L – 12.0L 18%
Above 12.0L 25%
Note that there is no tax below
2.5L. Take the input amount as input
from the user.*/
public class Ifelse8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your annual income : ");
        double income = scanner.nextDouble();

        double payable = 0;

        if (income <= 250000) {
            payable = 0;
        } else if (income <= 600000) {
            payable = (income - 250000) * 0.10;
        } else if (income <= 1200000) {

            payable = (600000 - 250000) * 0.10 + (income - 600000) * 0.18;
        } else {

            payable = (600000 - 250000) * 0.10 + (1200000 - 600000) * 0.18 + (income - 1200000) * 0.25;
        }


        System.out.println("Income Tax Payable: ₹" + payable);


    }
}
