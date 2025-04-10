package com.assignment.task2;

import java.util.Scanner;

/*Write a program to input basic
salary of an employee and calculate
its Gross salary according to
following:
Basic Salary <= 15000 : HRA = 25%,
DA = 82%
Basic Salary <= 20200 : HRA = 27%,
DA = 90%
Basic Salary > 20200 : HRA = 36%, DA
= 95%*/
public class Ifelse10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary:");
        double salary = sc.nextDouble();
        double HRA=0;
        double DA=0;
        if(salary<=15000){
            HRA= salary * 0.25;
            DA= salary * 0.82;
        }else if (salary <=20200){
            HRA= salary * 0.27;
            DA= salary * 0.90;
        }else{
            HRA= salary * 0.36;
            DA= salary * 0.95;
        }
        System.out.println(HRA +","+ DA);
    }
}
