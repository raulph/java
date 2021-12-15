/*

  CSE 17 Fall 2019
  @author Raphael Keele
  IBL 10
  Program: GenericArrayDemo

*/

import java.util.*; 

public class GenericArrayDemo <E extends Number>{
  
   private Number [] E;  // declarng an array of E's
  
  /*

      params: Number [] E 
      One arg constructor that initializes an array of Numbers 
  */
  GenericArrayDemo(Number [] E){
    this.E = E; 
  }
  
   /*

      params: none
      returns: Number array
      Getter array that returns E.
  */
  
  
  public Number[] getArray(){
    return this.E;
  }
  
  
   /*

      params: String [] args 
      Main method that declares different array types
  */
  
  public static void main(String[] args){
    Integer [] myArray1 = new Integer [10]; // creating an initializing an array of Integers
    for(int i = 0; i < 10; i++){
      myArray1[i] = i;
    }
    
    // creating and declaring an object of type Integers
    GenericArrayDemo<Integer> demo1 = new GenericArrayDemo<Integer>(myArray1);
    System.out.println(Arrays.toString(demo1.getArray()));
    //making a double array
    Double [] myArray2 = new Double [10];
    for(int i = 0; i < 10; i++){
      myArray2[i] = i*Math.PI;
    }
    // creating and declaring an object of type double
    GenericArrayDemo<Double> demo2 = new GenericArrayDemo<Double>(myArray2);
    System.out.println(Arrays.toString(demo2.getArray()));
    
    
  }
  
}