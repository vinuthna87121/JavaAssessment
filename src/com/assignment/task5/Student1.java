package com.assignment.task5;
//Create a class named 'Student' with
//String variable 'name' and integer
//variable 'EnrollmentNo'
//. Assign the
//value of EnrollmentNo as '132' and
//that of name as "Amay" by creating
//an object of the class Student, And
//Print the details of Amay.
public class Student1 {

        String name ;
        Integer enrollmentNo;
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name= "Amay";
        s1.enrollmentNo= 132;
        System.out.print(s1.name + " "+ s1.enrollmentNo);
    }
}
