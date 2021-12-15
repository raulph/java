/*
CSE 17 Fall 2019
@author Raphael
Homework #5  	
Program: TestCircle
*/


public class Circle implements GeometricObject {
  
  
  protected double radius = 1.0; // data field 
  
  /*
  param: radius 
  
  This 1-arg constructor initiliazes the circle object
  */
  Circle(double radius){
    this.radius = radius;
  }
  
  
  /*
  param: none
    This method calculates the perimeter of the circle.
  */
  @Override 
    public double getPerimeter(){
      return 2 * Math.PI * this.radius;
    }
  /*
  param: none
    This method calculates the area of the circle.
  */
  @Override
   public double getArea(){
    return Math.PI * this.radius * this.radius; 
   }
}