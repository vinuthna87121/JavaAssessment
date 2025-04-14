package com.assignment.task6;

import java.util.HashMap;
import java.util.Map;

//Program to Count occurrences of each
//character in a string in java?
public class Programming6 {
    public static void main(String[] args) {
        String str = "I am a very intelligent girl";
        String[] words = str.toLowerCase().trim().split("\\s+");
        Map<Character, Integer> freq = new HashMap<>();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            }

        }
        for (Map.Entry<Character, Integer> result : freq.entrySet()) {
            System.out.println(result.getKey() + ":" + result.getValue());
        }
    }
}
