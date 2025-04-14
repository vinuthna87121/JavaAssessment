package com.assignment.task5;
//Write a program to print the names of
//students by creating a Student
//class. If no name is passed while
//creating an object of Student class,
//then the name should be "Unknown"
//,
//otherwise the name should be
//equal to the String value passed
//while creating an object of Student
//class. (Hint: Overloading concept
public class Student2 {
    private String name;
    public Student2(){
        this.name= "unknown";
    }
    public Student2(String name){
        this.name=name;
    }
    public  void printName(){
        System.out.println("The name is " + name);
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
        Student2 s1= new Student2("VINUTHNA");
        Student2 s2= new Student2("liny");
        s.printName();
        s1.printName();
        s2.printName();

    }
}
