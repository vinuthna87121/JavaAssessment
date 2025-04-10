package com.assignment.task4;

//Write a program to find out whether
//a given integer is present in an
//array or not.(By Linear Search)
public class Arrays3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,99};
        int n = 99;
        boolean isfound = false;
        for (int array : arr) {
            if (array == n) {

                isfound = true;
                break;
            }
        }
        if (isfound) {
            System.out.print("present");
        }
            else{
                System.out.print("not present");


            }
        }
    }
