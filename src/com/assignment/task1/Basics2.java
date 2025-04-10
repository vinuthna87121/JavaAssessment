package com.assignment.task1;

import java.util.Scanner;

public class Basics2 {
    /*Take the user's name as input and
    print it to the console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter you name:");
        String username = sc.nextLine();
        System.out.println("hi " + username);

    }
}
