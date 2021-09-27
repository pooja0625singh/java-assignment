import java.io.*;

interface Calculation {
    void area();
    void perimeter();
    void name();
}

abstract class Circle implements Calculation {
    
    double pi = 3.14;
    int radius = 7;

    // overriding the methods
    @Override 
    public void area() {
       System.out.println("The area of Circle: " + (pi * radius * radius)); 
    } 

    @Override 
    public void perimeter() {
       System.out.println("The perimeter of Circle: " + (2 * pi * radius)); 
    }
}

abstract class Rectangle implements Calculation {
    
    int length = 2;
    int breadth = 3;

    // overriding the methods
    @Override 
    public void area() {
       System.out.println("The area of Rectangle: " + (length * breadth)); 
    } 

    @Override 
    public void perimeter() {
       System.out.println("The perimeter of Rectange: " + (2 * (length + breadth))); 
    }
}

class Shape1 extends Circle {
    @Override public void name() {
        System.out.println("Circle:");
    } 
}

class Shape2 extends Rectangle {
    @Override public void name() {
        System.out.println("Rectangle:");
    } 
}

public class Question1_coreJava {
    public static void main(String[] args) {
        Shape1 shape1 = new Shape1();
        Shape2 shape2 = new Shape2();

        shape1.name();
        shape1.area();
        shape1.perimeter();

        shape2.name();
        shape2.area();
        shape2.perimeter();
    }
}

