package com.assignment.task3;

import java.util.Scanner;

/*Print the following pattern
        *
        **
        ***
        ****
        *****   */
public class Loops7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");


            }
            System.out.println();
        }

    }
}
