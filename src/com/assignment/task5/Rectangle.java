package com.assignment.task5;
//Create a class named 'Rectangle'
//with two data members- length and
//breadth and a method to calculate the
//area which is 'length*breadth'
//. The
//class has three constructors which
//are :

//Now, create objects of the 'Rectangle'
//class having none, one, and two
//parameters and print their areas.
public class Rectangle {
    private double length;
    private double breadth;
    private double Area(){
        return length * breadth;
    }
    public Rectangle(){
        this.length= 0;
        this.breadth=0;
    }
    public Rectangle(double length,double breadth){
        this.length= length;
        this.breadth=breadth;
    }
    public Rectangle(int side){
        this.length=side;
        this.breadth=side;
    }

    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(2,3);
        Rectangle r3= new Rectangle(5);
        System.out.println( r1.Area());
        System.out.println( r2.Area());
        System.out.println( r3.Area());
    }
}
