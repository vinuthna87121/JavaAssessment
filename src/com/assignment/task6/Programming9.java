package com.assignment.task6;
//Find all possible combinations of
//String? (using recursion)
public class Programming9 {
    public static void main(String[] args) {
        String str="man";
        generateCombination("",str,0);


    }
    private static void generateCombination(String prefix, String str, int index){
        for(int i=index; i<str.length();i++){
            char ch = str.charAt(i);
            String newPrefix = prefix + ch;
            System.out.println(newPrefix);
            generateCombination(newPrefix,str,i+1);
        }

    }
}
