package com.assignment.task3;

import java.util.Scanner;

/*Write a program to Check Palindrome.*/
public class Loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();





        int temp=num;
        int rev=0;
        while(num!=0){
            int rem= num%10;
             rev= rev *10 +rem;
             num = num/10;

        }if(rev == temp){
            System.out.println("palindrome number");
        }else{
            System.out.println("not a palindrome");
        }
        sc.nextLine();
        System.out.println("enter a string:");
        String str = sc.nextLine();
        Loops3.stringPalindrome(str);
        sc.close();
    }
    private static void stringPalindrome(String str){
        String cleanedInput = str.replaceAll("[^A-Za-z]","");
        int first = 0;
        int last = cleanedInput.length()-1;
        boolean isPalindrome = true;
        while(first<last){
            if(cleanedInput.charAt(first)!=cleanedInput.charAt(last)){
         isPalindrome = false;
         break;
            }
                first++;
                last--;
            }

        if(isPalindrome){
            System.out.println(" palindrome string");
        }else{
            System.out.println("not palindrome string");
        }

    }
}
