package com.assignment.task1;

public class Basics3 {
    /*Swap two numbers using the third
    variable as the result name and do
    the same task without using any
    third variable.*/

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:" + "a:" + a +","+ "b:" +b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping using temp:"+ "a:"+ a + ","+"b:"+ b);
        Basics3.swap(2,6);

    }
    private static void swap(int a,int b){
        System.out.println("Before swapping:" + "a:" + a +","+ "b:" +b);
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping without temp:"+"a:" +a +","+ "b:"+ b);
    }
}


