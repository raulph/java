/*
CSE 17 Fall 2019
@author Raphael Keele 
Homework #5 
Program: TestResizableCircle
*/


import java.util.Scanner;

public class TestResizableCircle {
  public static void main(String [] args){
   

    
    int changesize = 35;
    System.out.println("All the circles will be changed by: " + changesize + " percent");
    ResizableCircle r1 = new ResizableCircle(9); // regular circle
    Circle r2 = new  ResizableCircle (10); 
    ResizableCircle r3 = (ResizableCircle) r2; // casting from Circle to ResizableCircle
   
    
    
    
    
    //printing all the circles
    
    System.out.println("The area is: " + r1.getArea()); 
    System.out.println("The perimeter is: " + r1.getPerimeter());
    System.out.println();
    r1.resize(changesize); // changing the size
    System.out.println("The area is: " + r1.getArea()); 
    System.out.println("The perimeter is: " + r1.getPerimeter());
    System.out.println();
    
    System.out.println("The area is: " + r3.getArea()); 
    System.out.println("The perimeter is: " + r3.getPerimeter());
    System.out.println(); 
    r3.resize(changesize); //changing the size
    System.out.println("The area is: " + r3.getArea()); 
    System.out.println("The perimeter is: " + r3.getPerimeter());
    System.out.println();

    
    
    
    
  }
}