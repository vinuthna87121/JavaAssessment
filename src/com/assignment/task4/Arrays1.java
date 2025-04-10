package com.assignment.task4;

import java.util.Scanner;

public class Arrays1 {
    /*Write a program to print an array
    populated by the user*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter "+ size + " elements");
        for(int i=0;i<size;i++){
            System.out.println("enter" + (i+1 )+ "element:" );
             array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
        }



    }
}
