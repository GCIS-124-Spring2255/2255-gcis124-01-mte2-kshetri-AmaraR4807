// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Rectangle.java

package mte2.shapes;

//public class Rectangle {
public class Rectangle implements Shape {
    
    private final double length;
    private final double width;

    public Rectangle(double length,double width) {  this.length = length;  this.width = width;  }

    @Override
    public double perimeter() {
        return ((length * 2) + (width * 2)); // perimeter is l + l + w + w 
    }

    @Override
    public double area() {
        return (length * width); // area is l * w
    }
    
    public static void main(String[] args) {
        
        // ...

    }
    
}