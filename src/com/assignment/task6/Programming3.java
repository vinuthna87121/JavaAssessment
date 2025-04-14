package com.assignment.task6;

import java.util.HashSet;
import java.util.Set;

//Program to find if String has all
//Unique Characters?
public class Programming3 {
    public static void main(String[] args) {
        String str = "viuthna";
        int length = str.length();
       // boolean isUnique=true;
        Set<Character> set = new HashSet<>();
        for(char s:str.toCharArray()){
            set.add(s);

        }
        if(set.size()==length){
            System.out.print("unique string");
        }else {
            System.out.print("not unique");
        }


    }
}
