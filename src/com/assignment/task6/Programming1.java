package com.assignment.task6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Program to find the first non-
//repeated character in the String
public class Programming1 {
    public static void main(String[] args) {
        String str = "iivavansh";
        char result = getNonRep(str);
        if(result != 0){
            System.out.println("First non-repeated character: " + result);
        }else{
            System.out.println("no unique character");
        }


    }

    public static char getNonRep(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);


        }
     for(Map.Entry<Character, Integer> entry : map.entrySet()){
         if(entry.getValue() == 1){
             return entry.getKey();
         }
        } return 0;


    }
}
