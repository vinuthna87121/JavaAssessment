package com.assignment.task5;

//Write a program that would print the
//information (name, year of joining,
//salary, address) of three employees
//by creating a class named 'Employee'
//The output should be as follows:
public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name,int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee[] employee = {new Employee("vinuthna", 2015, 200000, "wallstreet"),
                new Employee("lekha", 2011, 200600, "wallstreet - 12"),
                new Employee("venkat", 2025, 120000," newyork")};
        System.out.println("Name"+ "Year of Joining"+ "Salary"+ "Address");
        for(Employee emp:employee ){
            System.out.println(emp.name + emp.yearOfJoining +emp.salary +emp.address);

        }

    }
}