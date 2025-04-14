package com.assignment.task4;

//Write a Java program to check the
//equality of two arrays?
public class Arrays10 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {1,2,7,3};
        //samelength //sameelenmnts//same order
        boolean length = true;
        boolean elements = true;
       // boolean order = true;
        if(num1.length != num2.length){
            length=false;

        }
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]!= num2[j]){
                    elements= false;
                }
            }
        }
        if(!length && elements == false){
            System.out.print("not equal arrays");
        }else {
            System.out.print(" equal");
        }

    }
}
