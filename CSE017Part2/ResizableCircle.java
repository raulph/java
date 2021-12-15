
/*
CSE 17 Fall 2019
@author Raphael Keele
Homework #5 	
Program: ResizableCircle
*/



public class ResizableCircle extends Circle implements Resizable{

  /**
    param: radius
    
    1-arg constructor that when initialized also intializes circle
  */
  ResizableCircle(double radius){
    super(radius);
  }
  /**
  param: int percent 
  returns: changedsize which tis the new radius 
  
  this method calculates the new radius and multiplies it to the new one 
  */
  public double resize (int percent){
    double reduction = percent * .01; // first finding the percent and changing it to a double
    double changedsize = super.radius * reduction; // then making the new size;
    super.radius = changedsize; // setting it equal to radius 
    return changedsize; // returning the value
  }
  
}