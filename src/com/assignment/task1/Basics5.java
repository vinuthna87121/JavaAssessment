package com.assignment.task1;
/*Write a program to print the area of
circle, Take radius as input from
the user.(Area = 3.14*radius*radius*/

import java.util.Scanner;

public class Basics5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius= sc.nextInt();
        final float pi= 3.14f;
        float area = pi * radius * radius;
        System.out.println("Area of circle is :" + area);


    }
}
