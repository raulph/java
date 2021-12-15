/*
CSE 17 Fall 2019
@author Raphael
Homework #5  	
Program: TestCircle
*/


public class TestCircle {
  
  public static void main(String [] args) {
  
    Circle c1 = new Circle (5); // creating a new circle
    Circle c2 = new ResizableCircle(6); // upcasted a ResizableCircle to Circle
    Circle c3 = (Circle) c2; // casted this back to a cirlc
    GeometricObject c4 = new Circle(7); // upcasted a GeometricObject to Circle
    Circle c5 = (Circle) c4; // casted this back to a circle
    
    // THE following print statements prints all the Areas and Perimeters of the object. 
    
    System.out.println("The area is: " + c1.getArea()); 
    System.out.println("The perimeter is: " + c1.getPerimeter());
    System.out.println();
    System.out.println("The area is: " + c2.getArea()); 
    System.out.println("The perimeter is: " + c2.getPerimeter());
    System.out.println();
    System.out.println("The area is: " + c3.getArea()); 
    System.out.println("The perimeter is: " + c3.getPerimeter());
    System.out.println();
    System.out.println("The area is: " + c4.getArea()); 
    System.out.println("The perimeter is: " + c4.getPerimeter());
    System.out.println();
    System.out.println("The area is: " + c5.getArea()); 
    System.out.println("The perimeter is: " + c5.getPerimeter());
   
    
  }
}