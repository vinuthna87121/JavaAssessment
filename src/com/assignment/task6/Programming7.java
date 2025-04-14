package com.assignment.task6;
//Print all permutations of the String
public class Programming7 {
    public static void main(String[] args) {


        String str = "abc";
        possiblePermutations("",str);
    }

    public static void possiblePermutations(String prefix, String remaining) {
if(remaining.isEmpty()){
    System.out.println(prefix);
    return;
}
for(int i=0;i<remaining.length();i++){
    char ch = remaining.charAt(i);
    String newPrefix = prefix + ch;
    String newRemaining = remaining.substring(0,i)+ remaining.substring(i+1);
     possiblePermutations(newPrefix,newRemaining);

}
    }
}