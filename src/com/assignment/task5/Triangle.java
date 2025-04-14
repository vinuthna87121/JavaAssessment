package com.assignment.task5;

public class Triangle{
    int a,b,c;
public Triangle(){
     a=3;
     b=4;
     c=5;
}
private  int perimeter(){
    return a + b + c;
}
private double area(){
    double s = perimeter()/2.0;
    return Math.sqrt(s * (s-a) *(s-b)*(s-c));

}

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.print("Area is: " + t.area() + " ," + "perimeter is : "+t.perimeter());
    }
}
