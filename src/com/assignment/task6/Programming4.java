package com.assignment.task6;

//Program to Count the number of words
//in the String?
public class Programming4 {
    public static void main(String[] args) {


        String str = "I      am beautiful from within";
        String[] words = str.trim().split("\\s+");
        int count =words.length;

        System.out.println("count of words:" + count);
    }
}
